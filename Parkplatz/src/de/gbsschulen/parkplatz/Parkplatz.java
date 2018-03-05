package de.gbsschulen.parkplatz;

public class Parkplatz {
    protected Auto[] parkplatz;
    protected int anzahlAutos;

    public Parkplatz() {
        this.parkplatz = new Auto[3];
        this.anzahlAutos = 0;
    }

    public boolean istVoll(){
        return anzahlAutos >= parkplatz.length;
    }

    public boolean istLeer(){
        return anzahlAutos == 0;
    }

    public boolean parken(Auto auto){
        if (istVoll()) {
            return false;
        }
        parkplatz[anzahlAutos] = auto;
        this.anzahlAutos ++;
        // oft wird auch parkplatz[anzahlAutos++] = auto;
        return true;
    }

    public Auto wegfahren(){
        if(istLeer()){
            return null;
        }
        this.anzahlAutos --;
        Auto weggefahrenesAuto = parkplatz[0];
        for (int i = 0; i < anzahlAutos; i++) {
                parkplatz[i] = parkplatz [i + 1];
        }
        return weggefahrenesAuto;
    }
}
