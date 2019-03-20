package orent.marcin.myapplication;

public class Kalkulator {

private Float licznik;
private Float mianownik;

public Kalkulator(String licznik, String mianownik) {
        this.licznik = Float.parseFloat(licznik);
        this.mianownik = Float.parseFloat(mianownik);
        }
public String takeAction(String action){
        if(action.contains("+"))
        return dodawanie();
        if(action.contains("-"))
        return odejmowanie();
        if(action.contains("*"))
        return mnozenie();
        if (action.contains("/"))
        return dzielenie();
        return "0";
        }
public String mnozenie(){

        return String.valueOf(licznik*mianownik);
        }
public String dodawanie(){

        return String.valueOf(licznik+mianownik);
        }
public String odejmowanie(){

        return String.valueOf(licznik-mianownik);
        }
public String dzielenie(){

        return String.valueOf(licznik/mianownik);
        }

public Float getLicznik() {
        return licznik;
        }

public void setLicznik(Float licznik) {
        this.licznik = licznik;
        }

public Float getMianownik() {
        return mianownik;
        }

public void setMianownik(Float mianownik) {
        this.mianownik = mianownik;
        }
        }
