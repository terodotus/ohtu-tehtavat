
package ohtu.verkkokauppa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public interface KauppaInterface {
    
    
    void aloitaAsiointi();

    void lisaaKoriin(int id);

    void poistaKorista(int id);

    boolean tilimaksu(String nimi, String tiliNumero);
    
}
