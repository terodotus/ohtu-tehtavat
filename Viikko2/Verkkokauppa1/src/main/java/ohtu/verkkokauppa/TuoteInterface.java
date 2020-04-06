
package ohtu.verkkokauppa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public interface TuoteInterface {
    @Autowired
    boolean equals(Object o);
    @Autowired
    int getHinta();
    @Autowired
    int getId();
    @Autowired
    String toString();
    
}
