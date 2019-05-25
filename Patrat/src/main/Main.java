package main;

import patrat.Patrat;

public class Main {
    public static void main(String[] args) {
        Patrat patrat = new Patrat(5);
        System.out.println("Perimetrul este "+patrat.perimetru());
        System.out.println("Aria este "+patrat.getSurface());
        patrat.afiseaza();
        System.out.println(patrat);
        Patrat p2 = new Patrat(5);
        System.out.println(patrat==p2); //false
        System.out.println(patrat.equals(p2)); //true
        if(patrat instanceof Patrat)
            System.out.println(patrat);
    }
}
