
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
    
    @Override
    public boolean equals(Object o) {
        TuoteInterface t = (TuoteInterface)o;
        return id == t.getId();
    }
    
    @Override
    public int getId() {
        return this.id;
    }
    
    @Override
    public int getHinta() {
        return this.hinta;
    }
    
    @Override
    public String toString() {
        return this.nimi;
    }            
    
}
