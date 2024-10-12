package com.mentoring.mostenire;

public class Main {
    public static void main(String[] args) {
        // Crearea obiectelor
        Fasolea fasoleaRosie = new Fasolea("Fasole roșie", 120, "Roșie", "Proteine", "Fasole boabe");
        Soia soiaVerde = new Soia("Soia verde", 150, "Verde", "Fibre");
        Naut nautGalben = new Naut("Naut galben", 100, "Galbenă", "Fier");


        // Afișarea tuturor atributelor cu toString()
        System.out.println(fasoleaRosie);
        System.out.println(soiaVerde);
        System.out.println(nautGalben);
    }
}
