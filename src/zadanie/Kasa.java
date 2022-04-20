package zadanie;

import java.util.ArrayList;

public class Kasa {
    private double cena;
    //lista wszytskich aut
    ArrayList<Samochod> lista_aut = new ArrayList<Samochod>();

    public void uiszczenie_zaplaty(Kolejka k, Oplaty o) {

for(int i=0;i<lista_aut.size();i++)
{
    System.out.println("Auto : "+lista_aut.get(i)+" "+"uiściło opłatę naliczoną wcześniej w wysokości: "+ o.naliczenie_oplat(lista_aut.get(i)));
    System.out.println();
}
    }
}
