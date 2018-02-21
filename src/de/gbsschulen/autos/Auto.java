package de.gbsschulen.autos;

public class Auto {
    private String kennzeichen;
    private int ps;

    public Auto() {

    }

    public Auto(String kennzeichen, int ps) {
        this.kennzeichen = kennzeichen;
        this.ps = ps;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }
    public void druckeInfo(){
        System.out.println(kennzeichen);

    }
}
