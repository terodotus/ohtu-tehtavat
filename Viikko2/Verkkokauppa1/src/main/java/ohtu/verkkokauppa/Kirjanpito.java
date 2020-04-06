
package ohtu.verkkokauppa;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Kirjanpito implements KirjanpitoInterface {
    
    @Autowired
    private List<String> tapahtumat;
    
    @Autowired
    public Kirjanpito() {
        tapahtumat = new ArrayList<String>();
    }
    @Autowired
    @Override
    public void lisaaTapahtuma(String tapahtuma) {
        tapahtumat.add(tapahtuma);
    }
    @Autowired
    @Override
    public List<String> getTapahtumat() {
        return tapahtumat;
    }       
}
