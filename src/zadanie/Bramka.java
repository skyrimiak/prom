package zadanie;

import java.util.ArrayList;

public class Bramka {
    String nazwabramki;
    Kasa k;
    Kolejka kolej;



    public Bramka(String nazwabramki, Kasa k, Kolejka kolej) {
        this.nazwabramki = nazwabramki;
        this.k = k;
        this.kolej = kolej;
    }



    public void status_bramki(Kolejka k, Oplaty o, Bramka b, Bramka c, Bramka d) {
        //bramka 1
        System.out.println("Suma dla bramki: " + b.nazwabramki);
        int suma=0;
        System.out.println("Wielkosc kolejki w bramce: "+k.kolejka1.size());
        for (int i=0;i<k.kolejka1.size();i++)
        {
        suma+=  o.naliczenie_oplat(k.kolejka1.get(i));
        }
        System.out.println((suma+" PLN"));
        //zerowanie sumy
suma=0;
        //bramka 2
        System.out.println();
        System.out.println("Suma dla bramki: " + c.nazwabramki);
        System.out.println("Wielkosc kolejki w bramce: "+k.kolejka2.size());
        for (int i=0;i<k.kolejka2.size();i++)
        {
            suma+=  o.naliczenie_oplat(k.kolejka2.get(i));
        }
        if(k.kolejka2.size()!=0) {
            System.out.println((suma)+ "PLN");
        }
        //bramka 3
        System.out.println();
        System.out.println("Suma dla bramki: " + d.nazwabramki);
        //zerowanie sumy
         suma=0;
        System.out.println("Wielkosc kolejki w bramce: "+k.kolejka3.size()+ " aut");
        for (int i=0;i<k.kolejka3.size();i++)
        {
            suma+=  o.naliczenie_oplat(k.kolejka3.get(i));
        }
        System.out.println(suma+ " PLN");




    }
}

