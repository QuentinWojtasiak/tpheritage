/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal.regime;

import aliments.Aliment;
import aliments.Plante;

/**
 *
 * @author diginamic09
 */
public class Herbivore implements Regime{
    
    public Herbivore(){};
    
        public boolean manger(Aliment ali)
    {
        if(ali.getClass() != Plante.class)
            return true;
        else
            return false;
    };
    
}
