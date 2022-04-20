package zadanie;

import java.util.ArrayList;

public class Samochod {
    private String nazwa;
    private int Liczba_Pasazerow;
    waga w;


//konstruktor
    public Samochod(String nazwa, int liczba_pasazerow, waga w) {
        this.nazwa = nazwa;
        Liczba_Pasazerow = liczba_pasazerow;
        this.w=w;

    }
//gettery


    public String getNazwa() {
        return nazwa;
    }

    public int getLiczba_Pasazerow() {
        return Liczba_Pasazerow;
    }

    public waga getW() {
        return w;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "nazwa='" + nazwa + '\'' +
                ", Liczba_Pasazerow=" + Liczba_Pasazerow +
                ", w=" + w +
                '}';
    }
}
