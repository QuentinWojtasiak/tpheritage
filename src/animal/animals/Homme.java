/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal.animals;

import animal.Animal;
import animal.regime.Omnivore;
import animal.regime.Regime;

/**
 *
 * @author diginamic09
 */
public class Homme extends Animal{
    public Homme(int age, float poids, float taille, String nom,Regime reg){
        super(age,poids,taille,nom,reg);
    }
    
}
