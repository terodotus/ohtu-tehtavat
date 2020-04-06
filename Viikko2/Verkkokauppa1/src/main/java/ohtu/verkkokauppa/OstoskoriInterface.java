
package ohtu.verkkokauppa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public interface OstoskoriInterface {
    
    int hinta();

    void lisaa(Tuote t);

    void poista(Tuote t);
    
}
