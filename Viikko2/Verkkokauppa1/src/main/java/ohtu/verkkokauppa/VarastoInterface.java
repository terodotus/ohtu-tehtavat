
package ohtu.verkkokauppa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public interface VarastoInterface {
    @Autowired
    TuoteInterface haeTuote(int id);
    @Autowired
    void otaVarastosta(TuoteInterface t);
    @Autowired
    void palautaVarastoon(TuoteInterface t);
    @Autowired
    int saldo(int id);
}
