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
public interface PankkiInterface {
    @Autowired

    boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa);
    
}
