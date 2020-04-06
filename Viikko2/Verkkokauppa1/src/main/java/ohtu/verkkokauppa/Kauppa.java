package ohtu.verkkokauppa;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Kauppa implements KauppaInterface {
    
    @Autowired
    private VarastoInterface varasto;
    @Autowired
    private PankkiInterface pankki;
    @Autowired
    private OstoskoriInterface ostoskori;
    @Autowired
    private ViitegeneraattoriInterface viitegeneraattori;
    @Autowired
    private String kaupanTili;

    @Autowired
    public Kauppa(VarastoInterface varasto,PankkiInterface pankki,ViitegeneraattoriInterface viitegeneraattori){
        this.varasto=varasto;
        this.pankki=pankki;
        this.viitegeneraattori=viitegeneraattori;
        this.kaupanTili = "33333-44455";
    }

    @Autowired
    @Override
    public void aloitaAsiointi() {
        this.ostoskori = new Ostoskori();
    }

    @Autowired
    @Override
    public void poistaKorista(int id) {
        TuoteInterface t = this.varasto.haeTuote(id); 
        this.varasto.palautaVarastoon(t);
    }

    @Autowired
    @Override
    public void lisaaKoriin(int id) {
        if (this.varasto.saldo(id)>0) {
            TuoteInterface t = this.varasto.haeTuote(id);             
            this.ostoskori.lisaa(t);
            this.varasto.otaVarastosta(t);
        }
    }

    @Autowired
    @Override
    public boolean tilimaksu(String nimi, String tiliNumero) {
        int viite = viitegeneraattori.uusi();
        int summa = ostoskori.hinta();
        
        return pankki.tilisiirto(nimi, viite, tiliNumero, kaupanTili, summa);
    }

}
