package de.gbsschulen.autos;

public class Garage {
    private Auto [] autos;

    public Garage (int maxAnzahlAutos){
        this.autos = new Auto[maxAnzahlAutos];
    }
    public boolean hinzufuegen(Auto auto, int pos){
        if(pos < 0 || pos >= autos.length){
            return false;
        }
        autos[pos] = auto;
        return true;
    }

    public int anzahlAutos(){
        int anzahl = 0;
        for ( Auto auto : autos){
            if (auto != null) {
                anzahl ++;
            }
        }
        return anzahl;
    }

    public Auto entferneAuto(int pos){
    if (pos < 0 || pos >= autos.length){
        return null;
    }
    Auto entferntesAuto = autos[pos];
    autos[pos] = null;
    return entferntesAuto;
    }

    public void druckeInfo(){
        for (int i = 0; i < autos.length; i++) {
            Auto auto = autos[i];
            if(auto == null){
                System.out.println(i + " Kein Auto vorhanden");
            } else {
                System.out.println(i + " "+ auto.getKennzeichen() + " Leistung: " + auto.getPs());
            }
        }
    }
}
