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
public class Carnivore implements Regime{
    
    public Carnivore(){};
    
    public boolean manger(Aliment ali)
    {
        if(ali.getClass() != Viande.class)
            return true;
        else
            return false;
    };
    
}
