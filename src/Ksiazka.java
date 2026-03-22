public class Ksiazka {
    private String tytul;
    private String autor;
    private int liczbaStron;
    private boolean dostepna;

    public Ksiazka(String tytul, String autor, int liczbaStron, boolean dostepna){
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.dostepna = dostepna;
    }

    public void wypiszInfo(){
        System.out.println("Tytuł: " + tytul);
        System.out.println("Autor: " + autor);
        System.out.println("Liczba stron: " + liczbaStron);
        System.out.println("Dostępna: " + (dostepna ? "tak" : "nie"));

    }
    public void wypozycz() {
        if (dostepna) {
            dostepna = false;
            System.out.println("Wypożyczono książkę: " + tytul);
        } else {
            System.out.println("Książka \"" + tytul + "\" jest już wypożyczona.");
        }
    }
    public void zwroc() {
        if (!dostepna) {
            dostepna = true;
            System.out.println("Zwrócono książkę: " + tytul);
        } else {
            System.out.println("Książka \"" + tytul + "\" była już dostępna.");
        }
    }
    public String getTytul() {
        return tytul;
    }

    public boolean isDostepna() {
        return dostepna;
    }
}
