/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal.animals;

import animal.Animal;
import animal.regime.Carnivore;
import animal.regime.Regime;

/**
 *
 * @author diginamic09
 */
public class Hyene extends Animal {
    public Hyene(int age, float poids, float taille, String nom,Regime reg){
        super(age,poids,taille,nom,reg);
    }
}
