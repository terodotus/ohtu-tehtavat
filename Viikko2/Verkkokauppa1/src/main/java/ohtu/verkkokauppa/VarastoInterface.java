
package ohtu.verkkokauppa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public interface VarastoInterface {
    @Autowired
    Tuote haeTuote(int id);
    @Autowired
    void otaVarastosta(Tuote t);
    @Autowired
    void palautaVarastoon(Tuote t);
    @Autowired
    int saldo(int id);
}
