
package ohtu.verkkokauppa;


import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public interface KirjanpitoInterface {
    
    List<String> getTapahtumat();
    
    void lisaaTapahtuma(String tapahtuma);
    
}
