package ohtu.verkkokauppa;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Varasto implements VarastoInterface {
    
    @Autowired
    private KirjanpitoInterface kirjanpito;
    @Autowired
    private HashMap<TuoteInterface, Integer> saldot;  
    
    @Autowired
    public Varasto(KirjanpitoInterface kirjanpito) {
        this.kirjanpito=kirjanpito;
        this.saldot = new HashMap();
        this.alustaTuotteet();
    }

    @Autowired  
    @Override
    public TuoteInterface haeTuote(int id){
        for (TuoteInterface t : this.saldot.keySet()) {
            if ( t.getId()==id) {
                return t;
            } 
        }
        return null;
    }
    @Autowired
    @Override
    public int saldo(int id){
        return this.saldot.get(haeTuote(id));
    }
    @Autowired
    @Override
    public void otaVarastosta(TuoteInterface t){        
        this.saldot.put(t,  saldo(t.getId())-1 );
        kirjanpito.lisaaTapahtuma("otettiin varastosta "+t);
    }
    
    @Autowired
    @Override
    public void palautaVarastoon(TuoteInterface t){
        this.saldot.put(t,  saldo(t.getId())+1 );
        kirjanpito.lisaaTapahtuma("palautettiin varastoon "+t);
    }    
    @Autowired
    private void alustaTuotteet() {
        this.saldot.put(new Tuote(1, "Koff Portteri", 3), 100);
        this.saldot.put(new Tuote(2, "Fink Bräu I", 1), 25);
        this.saldot.put(new Tuote(3, "Sierra Nevada Pale Ale", 5), 30);
        this.saldot.put(new Tuote(4, "Mikkeller not just another Wit", 7), 40);
        this.saldot.put(new Tuote(5, "Weihenstephaner Hefeweisse", 4), 15);
    }
}
