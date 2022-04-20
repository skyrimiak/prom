package zadanie;

import java.util.ArrayList;
import java.util.Random;

public class Kolejka {
   public ArrayList<Samochod> kolejka1 = new ArrayList<Samochod>();
  public ArrayList<Samochod> kolejka2 = new ArrayList<Samochod>();
      public ArrayList<Samochod> kolejka3 = new ArrayList<Samochod>();
    public void wjazd(Samochod s, Kasa k)
    {
        Random r = new Random();
        int numer_kolejki = r.nextInt(4-1)+1;
        System.out.println("Numer kolejki auta "+s+" "+numer_kolejki);
        if(numer_kolejki==1)
        {
            kolejka1.add(s);
        }
        else if (numer_kolejki==2)
        {
            kolejka2.add(s);
        }
        else
            kolejka3.add(s);
    // dodajemy uto do listy wszytkich aut
k.lista_aut.add(s);
    }
   // public void wyjazd(Samochod s)
    public void kolej()
    {
        System.out.println(kolejka1);
        System.out.println(kolejka2);
        System.out.println(kolejka3);
    }
    public void s(Oplaty s)
    {
      s.sumaoplat();
    }
    public void getNajdluzszakolejka()
    {
        int highest=0;
        String s="";
        if(kolejka1.size()>highest)
        {
            highest=kolejka1.size();
            s="Najdluższa kolejka to kolejka 1 o ilości:";
        }
         if (kolejka2.size()>highest)
        {
            highest=kolejka2.size();
            s="Najdluższa kolejka to kolejka 2 o ilości:";

        }
        if (kolejka3.size()>highest) {
            highest = kolejka3.size();
            s="Najdluższa kolejka to kolejka 3 o ilości:";

        }
        System.out.println(s+" "+ highest);

    }


}

