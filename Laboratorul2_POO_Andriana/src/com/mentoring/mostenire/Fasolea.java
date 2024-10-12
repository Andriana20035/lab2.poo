package com.mentoring.mostenire;


// Moștenire simplă
public class Fasolea extends FamiliaFabacee {
    private String tipFasole; // Trăsătură specifică pentru Fasolea

    public Fasolea(String specie, double perioadaVegetatie, String culoare, String nutrienti, String tipFasole) {
        super(specie, perioadaVegetatie, culoare, nutrienti);
        this.tipFasole = tipFasole;
    }

    // Getter și Setter pentru tipFasole
    public String getTipFasole() {
        return tipFasole;
    }

    public void setTipFasole(String tipFasole) {
        this.tipFasole = tipFasole;
    }

    // Suprascrierea metodei toString pentru a include tipul de fasole
    @Override
    public String toString() {
        return super.toString() + ", Tip Fasole: " + tipFasole; // Afișăm toate atributele din clasa de bază plus tipul
    }
}
