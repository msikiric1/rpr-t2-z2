package ba.unsa.etf.rpr;

public class Racun {
    private Long brojRacuna;
    private Osoba korisnikRacuna;
    private boolean odobrenjePrekoracenja;
    private Double stanjeRacuna;
    public Racun(Long brojRacuna, Osoba korisnikRacuna) {
        this.brojRacuna = brojRacuna;
        this.korisnikRacuna = korisnikRacuna;
    }
    public boolean provjeriOdobrenjePrekoracenja(Double stanjeracuna) { return odobrenjePrekoracenja; }
    public boolean izvrsiUplatu(Double stanjeRacuna) { return true; }
    public boolean izvrsiIsplatu(Double stanjeRacuna) { return false; }
    public void odobriPrekoracenje(Double stanjeRacuna) { odobrenjePrekoracenja = true; }
}
