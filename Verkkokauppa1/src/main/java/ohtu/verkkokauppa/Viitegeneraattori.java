package ohtu.verkkokauppa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Viitegeneraattori implements ViitegeneraattoriInterface {
    @Autowired
    private int seuraava;
    
    public Viitegeneraattori(){
        this.seuraava = 1;    
    }
    
    @Override
    public int uusi(){
        return seuraava++;
    }
}
