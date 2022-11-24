package org.example;

public class Angajat implements Element {

    private String nume;

   public static int salar;

    public Angajat(String nume, int salar) {

        this.nume = nume;
        this.salar =  salar;


    }


    public void print() {
        System.out.println("Numele angajatului este:" + this.nume + "   Salar:"+ this.salar );
    }

    @Override
    public void add(Element element) {


    }

    @Override
    public void remove(Element element) {
        //not needed
    }

    @Override
    public boolean find(Element element) {
        if (!(element instanceof Angajat))
            return false;
        else {
            return ((Angajat) element).nume.equals(this.nume);
        }

    }


}
