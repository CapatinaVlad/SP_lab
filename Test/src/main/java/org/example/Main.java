package org.example;

import java.util.Objects;

public class Main {


    public static void main(String[] args) throws Exception {

        int x = 0;



        {
            Departament Quality = new Departament("Quality");
            Departament Productie = new Departament("Productie");




            Angajat ion = new Angajat("Ion", 5000);


            Angajat andrei = new Angajat("Andrei", 6000);
            Angajat ilie = new Angajat("Ilie", 4000);
            Angajat gicu = new Angajat("Gicu",4000);




            Job manager = new Job("Manager");
            Job programator = new Job("Programator");




            manager.add(ion);
            manager.add(andrei);
            Quality.addContent(manager);

            programator.add(ilie);
            programator.add(gicu);



            Productie.addContent(programator);


            if (Objects.equals(Job.numejob, "Manager"))
                x = x + Angajat.salar;





            Quality.print();
Productie.print();

        }
    }
}