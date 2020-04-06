
package ohtu.verkkokauppa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public interface KauppaInterface {
    
    @Autowired
    void aloitaAsiointi();
    @Autowired
    void lisaaKoriin(int id);
    @Autowired
    void poistaKorista(int id);
    @Autowired
    boolean tilimaksu(String nimi, String tiliNumero);
    
}
