
package ohtu.verkkokauppa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public interface ViitegeneraattoriInterface {
    @Autowired
    int uusi();
   
}
