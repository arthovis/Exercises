package com.andrei.exercises.interfaces;

public class Cont implements TranzactiiCont {
    private String nume;
    private int suma;
    private int salariu;
    private int facturi;
    private int totalInainteDeFacturi;
    private int totalDupaFacturi;

    public Cont(String nume,int suma, int salariu, int facturi) {
        this.nume = nume;
        this.suma = suma;
        this.salariu = salariu;
        this.facturi = facturi;
    }

    @Override
    public int primesteSalariu(){
        totalInainteDeFacturi = suma+salariu;
        return totalInainteDeFacturi;
    }

    @Override
    public int platesteFacturi(){
        totalDupaFacturi = totalInainteDeFacturi - facturi;
        return totalDupaFacturi;
    }

    @Override
    public void print(){
        System.out.println("Clientul "+nume+" ramane cu "+totalDupaFacturi+" lei pana la urmatorul salariu.");
    }

}
