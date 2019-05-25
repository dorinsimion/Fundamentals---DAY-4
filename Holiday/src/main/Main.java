package main;

import vacanta.Holiday;
public class Main {
    public static void main(String[] args) {
        Holiday holiday1 = new Holiday("Grecia",8);
        System.out.println("Zile concediu dupa prima excursie"
                + Holiday.zileConcediuRamasa());
        Holiday holiday2 = new Holiday("Thailanda",21);
        holiday1.afiseaza();
        holiday2.afiseaza();
        System.out.println("Zile condediu dupa 2 excursii "
                + Holiday.zileConcediuRamasa());
    }
}
