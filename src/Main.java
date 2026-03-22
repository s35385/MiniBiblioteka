public class Main {
    public static void main(String[] args) {
        //z1
        Ksiazka harryPotter = new Ksiazka("Harry Potter", "J.K. Rowling", 300, true);

        System.out.println(harryPotter);

        harryPotter.wypiszInfo();
        harryPotter.wypozycz();
        harryPotter.zwroc();
    }
}
