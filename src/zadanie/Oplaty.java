package zadanie;

public class Oplaty {
    int oplata_osoby;
    int oplata_waga;
    int suma;
    public int naliczenie_oplat(Samochod s)
    {
        //ustalamy opłate za ilość pasażerów
        if(s.getLiczba_Pasazerow()>3)
        {
            oplata_osoby = 100;
        }
        else oplata_osoby=50;

        //ustalamy opłate za wagę
        if(s.getW()==waga.Do1T)
        {
            oplata_waga=130;
        }
        else if(s.getW()==waga.Od1Tdo3T5)
        {
            oplata_waga=160;
        }
        else
            oplata_waga=240;

        suma=oplata_waga+oplata_osoby;
        return suma;

    }
    public int sumaoplat()
    {
        return suma;
    }

    public int sumadlaauta(Samochod s)
    {
        System.out.println("Suma dla auta "+s);
        return suma;
    }
}

