
package ohtu.verkkokauppa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public interface OstoskoriInterface {
    
    int hinta();
    
    void lisaa(TuoteInterface t);
    
    void poista(TuoteInterface t);
    
}
