package org.example;

import java.util.ArrayList;


public class Job implements Element {
   public static String numejob;
    private ArrayList<Element> elements;

    public Job(String numejob) {
        this.numejob = numejob;
        this.elements = new ArrayList<Element>();
    }

    @Override
    public void add(Element element) throws Exception {
        for (Element i : this.elements)
            if (i.find(element))
                throw new Exception("Unsupported Operation");

        this.elements.add(element);

    }

    @Override
    public void remove(Element element) {
        this.elements.remove(element);
    }

    @Override
    public boolean find(Element element) {
        for (Element i : this.elements) {
            if (i.find(element))
                return true;
        }

        return false;
    }

    public void print() {
        System.out.println("Nume job: " + this.numejob);

        for (Element i : this.elements)
            i.print();
    }


}
