
package ohtu.verkkokauppa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public interface VarastoInterface {
    
    TuoteInterface haeTuote(int id);
    
    void otaVarastosta(TuoteInterface t);
    
    void palautaVarastoon(TuoteInterface t);
    
    int saldo(int id);
}
