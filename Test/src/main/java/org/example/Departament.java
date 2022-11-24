package org.example;

import java.util.ArrayList;

public class Departament {
    private String numedepartament;
    private ArrayList<Element> elements;


    public Departament(String numedepartament) {
        this.numedepartament = numedepartament;
        this.elements = new ArrayList<Element>();

    }

    public void addContent (Element element) {
        this.elements.add(element);
    }



    public void print() {
        System.out.println("Departament: " + this.numedepartament);




        for (Element i : this.elements)
            i.print();
    }
}