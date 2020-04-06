
package ohtu.verkkokauppa;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tuote implements TuoteInterface {
    
    @Autowired
    private int id;
    @Autowired
    private String nimi;
    @Autowired
    private int hinta;
    
    @Autowired
    public Tuote(int id, String nimi, int hinta) {
        this.id = id;
        this.nimi = nimi;
        this.hinta = hinta;
    }
    @Autowired
    @Override
    public boolean equals(Object o) {
        Tuote t = (Tuote)o;
        return id==t.id;
    }
    @Autowired
    @Override
    public int getId() {
        return id;
    }
    @Autowired
    @Override
    public int getHinta() {
        return hinta;
    }
    @Autowired
    @Override
    public String toString() {
        return nimi;
    }            
    
}
