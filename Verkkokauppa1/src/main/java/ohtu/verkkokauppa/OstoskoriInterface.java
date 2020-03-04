/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.verkkokauppa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Tero
 */
@Component

public interface OstoskoriInterface {
    @Autowired
            

    int hinta();

    void lisaa(Tuote t);

    void poista(Tuote t);
    
}
