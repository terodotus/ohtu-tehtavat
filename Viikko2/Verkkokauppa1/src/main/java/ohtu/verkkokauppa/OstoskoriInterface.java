
package ohtu.verkkokauppa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public interface OstoskoriInterface {
    @Autowired
    int hinta();
    @Autowired
    void lisaa(TuoteInterface t);
    @Autowired
    void poista(TuoteInterface t);
    
}
