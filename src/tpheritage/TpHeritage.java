/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpheritage;

import aliments.Plante;
import aliments.Viande;
import animal.Animal;
import animal.animals.Homme;
import animal.animals.Lion;
import animal.regime.Carnivore;
import animal.regime.Omnivore;

/**
 *
 * @author diginamic09
 */
public class TpHeritage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Plante uneP = new Plante("herbe");
        Viande uneV = new Viande("steak");
        Lion rex = new Lion(30,250,2,"rex",new Carnivore());
        Homme jul = new Homme(28,90,1.72f,"Jul",new Omnivore());
        
        System.out.println(rex.getLeRegime().manger(jul));
        
    }
    
}
