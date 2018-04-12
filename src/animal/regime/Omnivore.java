/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal.regime;

import aliments.Aliment;
import aliments.Viande;


/**
 *
 * @author diginamic09
 */

public class Omnivore implements Regime{
    
    public Omnivore(){};
    
    public boolean manger(Aliment ali)
    {
            return true;
    };
    
}
