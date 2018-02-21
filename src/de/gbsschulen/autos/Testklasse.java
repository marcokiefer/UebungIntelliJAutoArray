package de.gbsschulen.autos;

public class Testklasse {
    public static void main(String[] args) {
        Garage garage = new Garage(3);
        Auto auto = new Auto("WM-MK-668",160);
        Auto auto1 = new Auto("LL-K-69",201);
        Auto auto2 = new Auto ("M-K-688",190);
        garage.hinzufuegen(auto,0);
        garage.hinzufuegen(auto1,1);
        garage.hinzufuegen(auto2,2);
        garage.druckeInfo();
        System.out.println("------------------------ Anzahl Autos:");
        garage.anzahlAutos();
        System.out.println(garage.anzahlAutos());
        System.out.println("------------------------ Entferne Auto anzahl:");
        garage.entferneAuto(1);
        System.out.println(garage.anzahlAutos());
        boolean result = garage.hinzufuegen(new Auto("WM-BS-18",80),4);
        if (result) {
            System.out.println("Hat geklappt");
        } else {
            System.out.println("Gerage bereits voll");
        }


    }
}
