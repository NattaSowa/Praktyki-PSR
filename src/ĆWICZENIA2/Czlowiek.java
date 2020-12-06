package ĆWICZENIA2;

public class Czlowiek {
    private float wzrost;
    private float waga;
    private String imie;
    private String nazwisko;

    public Czlowiek(float wzrost, float waga, String imie, String nazwisko){
        this.wzrost = wzrost;
        this.waga = waga;
        this.imie = imie;
        this.nazwisko = nazwisko;


    }

    public void setWzrost(float wzrost) {
        this.wzrost = wzrost;
    }

    public void setWaga(float waga) {
        this.waga = waga;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

}
