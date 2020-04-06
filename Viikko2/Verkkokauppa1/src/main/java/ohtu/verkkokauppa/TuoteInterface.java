
package ohtu.verkkokauppa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public interface TuoteInterface {
    
    boolean equals(Object o);
    
    int getHinta();
    
    int getId();
    
    String toString();
    
}
