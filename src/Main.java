public class Main {
    public static void main(String[] args) {
        //z1
        Ksiazka harryPotter = new Ksiazka("Harry Potter", "J.K. Rowling", 300, true);

        System.out.println(harryPotter);

        harryPotter.wypiszInfo();
        harryPotter.wypozycz();
        harryPotter.zwroc();

        //z2
        Czytelnik janKowalski = new Czytelnik("Jan", "Kowalski", 1);
        System.out.println(janKowalski);
        janKowalski.wypiszDane();

        Czytelnik alaKot = new Czytelnik("Ala", "Kot", 2);
        System.out.println(alaKot);
        alaKot.wypiszDane();

        //z3
        Biblioteka biblioteka = new Biblioteka(10);  // pojemność 10 książek

        biblioteka.dodajKsiazke(new Ksiazka("1984", "George Orwell", 350, true));
        biblioteka.dodajKsiazke(new Ksiazka("Hobbit", "J.R.R. Tolkien", 280, true));
        biblioteka.dodajKsiazke(new Ksiazka("Duma i Uprzedzenie", "Jane Austen", 400, true));

        System.out.println("\n--- Dostępne książki ---");
        biblioteka.wypiszDostepneKsiazki();

        Ksiazka znaleziona = biblioteka.znajdzKsiazkePoTytule("Hobbit");
        if (znaleziona != null) {
            System.out.println("\nZnaleziono książkę:");
            znaleziona.wypiszInfo();
        }

        System.out.println("\nLiczba dostępnych książek: " + biblioteka.policzDostepneKsiazki());

        //z4
        System.out.println("\n--- Wypożyczanie książek ---");
        Biblioteka.wypozyczKsiazke("Hobbit", janKowalski, biblioteka);
        Biblioteka.wypozyczKsiazke("Duma i Uprzedzenie", alaKot, biblioteka);

        System.out.println("\n--- Dostępne książki po wypożyczeniu ---");
        biblioteka.wypiszDostepneKsiazki();

        System.out.println("\n--- Zwroty książek ---");
        Biblioteka.zwrocKsiazke("Hobbit", janKowalski, biblioteka);

        System.out.println("\n--- Dostępne książki po zwrocie ---");
        biblioteka.wypiszDostepneKsiazki();

        System.out.println("\n--- Dane czytelników ---");
        janKowalski.wypiszDane();
        alaKot.wypiszDane();
    }
}
