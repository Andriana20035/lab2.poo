package com.mentoring.mostenire;

public class FamiliaFabacee {
    private String specie;
    private double perioadaVegetatie; // în zile
    private String culoare;
    private String nutrienti;

    // Constructor
    public FamiliaFabacee(String specie, double perioadaVegetatie, String culoare, String nutrienti) {
        this.specie = specie;
        this.perioadaVegetatie = perioadaVegetatie;
        this.culoare = culoare;
        this.nutrienti = nutrienti;
    }


    public String getSpecie() {
        return specie;
    }
    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public double getPerioadaVegetatie() {
        return perioadaVegetatie;
    }
    public void setPerioadaVegetatie(double perioadaVegetatie) {
        this.perioadaVegetatie = perioadaVegetatie;
    }

    public String getCuloare() {
        return culoare;
    }
    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getNutrienti() {
        return nutrienti;
    }
    public void setNutrienti(String nutrienti) {
        this.nutrienti = nutrienti;
    }

    // Metoda toString
    @Override
    public String toString() {
        return "Specie: " + specie + ", Perioada de vegetație: " + perioadaVegetatie +
                " zile, Culoare: " + culoare + ", Nutrienți: " + nutrienti;
    }
}
