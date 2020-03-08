package ohtu.verkkokauppa;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Ostoskori implements OstoskoriInterface {
    @Autowired
    ArrayList<Tuote> tuotteet;

    public Ostoskori() {
        tuotteet = new ArrayList<Tuote>();
    }

    @Override
    public void lisaa(Tuote t) {
        this.tuotteet.add(t);
    }

    @Override
    public void poista(Tuote t) {
        this.tuotteet.remove(t);
    }

    @Override
    public int hinta() {
        int hinta = 0;

        for (Tuote tuote : this.tuotteet) {
            hinta += tuote.getHinta();
        }

        return hinta;
    }
}
