package test;

import zadanie.*;

public class test {
    public static void main(String[] args) {
//tworzymy auta
Samochod w1= new Samochod("Volvo",4, waga.Do1T);
Samochod w2 = new Samochod("Fiat",2,waga.Od1Tdo3T5);
Samochod w3 = new Samochod("Kia",2,waga.Od1Tdo3T5);
Samochod w4 = new Samochod("Toyota",5,waga.Pow3T5);
//tworzenie kasy i opłat
        Kasa k1 = new Kasa();
        Oplaty o1= new Oplaty();

        //auta sa przyporzadkowane do kolejki (losowo)
        System.out.println("\t Auta podjeżdzają do bramek: \n");
        Kolejka k = new Kolejka();
        k.wjazd(w1,k1);
        k.wjazd(w2,k1);
        k.wjazd(w3,k1);
        k.wjazd(w4,k1);
        // tworzenie bramek
        Bramka b1 = new Bramka("Bramka1",k1,k);
        Bramka b2 = new Bramka("Bramka2",k1,k);
        Bramka b3= new Bramka("Bramka 3",k1,k);
        System.out.println();
        // naliczanie oplat dla poszczegolnych aut
         o1.naliczenie_oplat(w1);
        System.out.println(o1.sumadlaauta(w1));
         o1.naliczenie_oplat(w2);
        System.out.println(o1.sumadlaauta(w2));
         o1.naliczenie_oplat(w3);
        System.out.println(o1.sumadlaauta(w3));
         o1.naliczenie_oplat(w4);
        System.out.println(o1.sumadlaauta(w4));
         //status naliczonych oplat w bramkach;
        System.out.println();
        System.out.println(" \t Naliczane są sumy opłat w poszczególnych bramkach  \n ");
        b1.status_bramki(k,o1,b1,b2,b3);
        System.out.println();
        k.getNajdluzszakolejka();
        System.out.println();

        //uisczenie opłat, potweirdzenie w kasie
        System.out.println("\t Uiszczanie opłat dla poszczególnych aut w kasie: ");
        k1.uiszczenie_zaplaty(k,o1);



    }
}
