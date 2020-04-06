package ohtu.verkkokauppa;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Ostoskori implements OstoskoriInterface {
    
    @Autowired
    ArrayList<TuoteInterface> tuotteet;

    @Autowired
    public Ostoskori() {
        tuotteet = new ArrayList();
    }
    @Autowired
    @Override
    public void lisaa(TuoteInterface t) {
        this.tuotteet.add(t);
    }
    @Autowired
    @Override
    public void poista(TuoteInterface t) {
        this.tuotteet.remove(t);
    }
    @Autowired
    @Override
    public int hinta() {
        int hinta = 0;

        for (TuoteInterface tuote : this.tuotteet) {
            hinta += tuote.getHinta();
        }
        return hinta;
    }
}
