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
    }
}
