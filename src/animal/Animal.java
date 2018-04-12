/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

import aliments.Aliment;
import aliments.Viande;
import animal.regime.Regime;

/**
 *
 * @author diginamic09
 */
public abstract class Animal extends Viande{
    
    private int age;
    private float taille, poids;
    private String nom;
    private Regime leRegime;
    
    public Animal(String nom)
    {
        super(nom);
    }
    
    public Animal(int age, float poids, float taille, String nom, Regime reg)
    {
        super(nom);
        this.age=age;
        this.nom=nom;
        this.poids=poids;
        this.taille=taille;
        this.leRegime=reg;
    }
    
    public String getNom()
    {
        return this.nom;
    }
    
    public Regime getLeRegime()
    {
        return this.leRegime;
    }
}
