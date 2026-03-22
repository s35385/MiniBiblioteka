public class Biblioteka {

    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;

    public Biblioteka(int pojemnosc) {
        ksiazki = new Ksiazka[pojemnosc];
        liczbaKsiazek = 0;
    }

    public void dodajKsiazke(Ksiazka ksiazka) {
        if (liczbaKsiazek < ksiazki.length) {
            ksiazki[liczbaKsiazek] = ksiazka;
            liczbaKsiazek++;
            System.out.println("Dodano książkę: ");
            ksiazka.wypiszInfo();
        } else {
            System.out.println("Biblioteka jest pełna!");
        }
    }

    public void wypiszDostepneKsiazki() {
        System.out.println("\nDostępne książki:");

        for (int i = 0; i < liczbaKsiazek; i++) {
            ksiazki[i].wypiszInfo();
            System.out.println("----------------");
        }
    }

    public Ksiazka znajdzKsiazkePoTytule(String tytul) {
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].getTytul().equalsIgnoreCase(tytul)) {
                return ksiazki[i];
            }
        }
        return null;
    }

    public int policzDostepneKsiazki() {
        int licznik = 0;

        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].isDostepna()) {
                licznik++;
            }
        }

        return licznik;
    }
    // metody do z4
    public static void wypozyczKsiazke(String tytul, Czytelnik czytelnik, Biblioteka biblioteka) {
        Ksiazka ksiazka = biblioteka.znajdzKsiazkePoTytule(tytul);
        if (ksiazka == null) {
            System.out.println("Nie znaleziono książki: " + tytul);
            return;
        }

        if (ksiazka.isDostepna()) {
            ksiazka.wypozycz();
            czytelnik.zwiekszLiczbeWypozyczen();
            System.out.println("Czytelnik " + czytelnik.getImie() + " " + czytelnik.getNazwisko() +
                    " wypożyczył książkę: " + tytul);
        } else {
            System.out.println("Książka \"" + tytul + "\" jest już wypożyczona.");
        }
    }

    public static void zwrocKsiazke(String tytul, Czytelnik czytelnik, Biblioteka biblioteka) {
        Ksiazka ksiazka = biblioteka.znajdzKsiazkePoTytule(tytul);
        if (ksiazka == null) {
            System.out.println("Nie znaleziono książki: " + tytul);
            return;
        }

        if (!ksiazka.isDostepna()) {
            ksiazka.zwroc();
            czytelnik.zmniejszLiczbeWypozyczen();
            System.out.println("Czytelnik " + czytelnik.getImie() + " " + czytelnik.getNazwisko() +
                    " zwrócił książkę: " + tytul);
        } else {
            System.out.println("Książka \"" + tytul + "\" była już dostępna.");
        }
    }
}
