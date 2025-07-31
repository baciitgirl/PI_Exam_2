package Bibi;

public class Buch {
    private String titel;
    private String isbn;
    private String autor;
    private String veröffentlichungsdatum;
    private boolean verfügbar;

    int seitenAnzahl;
    double buchHoehe;
    String herkunftsland;
    String genre;
    boolean digitalVerfuegbar;
    float buchLaenge;
    String buchFarbe;
    long wortAnzahl;

    public Buch(String titel, String isbn, String autor, String veröffentlichungsdatum, boolean verfügbar) {
        this.titel = titel;
        this.isbn = isbn;
        this.autor = autor;
        this.veröffentlichungsdatum = veröffentlichungsdatum;
        this.verfügbar = verfügbar;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getVeröffentlichungsdatum() {
        return veröffentlichungsdatum;
    }

    public void setVeröffentlichungsdatum(String veröffentlichungsdatum) {
        this.veröffentlichungsdatum = veröffentlichungsdatum;
    }

    public boolean isVerfügbar() {
        return verfügbar;
    }

    public void setVerfügbar(boolean verfügbar) {
        this.verfügbar = verfügbar;
    }

    public int getSeitenAnzahl() {
        return seitenAnzahl;
    }

    public void setSeitenAnzahl(int seitenAnzahl) {
        this.seitenAnzahl = seitenAnzahl;
    }

    public double getBuchHoehe() {
        return buchHoehe;
    }

    public void setBuchHoehe(double buchHoehe) {
        this.buchHoehe = buchHoehe;
    }

    public String getHerkunftsland() {
        return herkunftsland;
    }

    public void setHerkunftsland(String herkunftsland) {
        this.herkunftsland = herkunftsland;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isDigitalVerfuegbar() {
        return digitalVerfuegbar;
    }

    public void setDigitalVerfuegbar(boolean digitalVerfuegbar) {
        this.digitalVerfuegbar = digitalVerfuegbar;
    }

    public float getBuchLaenge() {
        return buchLaenge;
    }

    public void setBuchLaenge(float buchLaenge) {
        this.buchLaenge = buchLaenge;
    }

    public String getBuchFarbe() {
        return buchFarbe;
    }

    public void setBuchFarbe(String buchFarbe) {
        this.buchFarbe = buchFarbe;
    }

    public long getWortAnzahl() {
        return wortAnzahl;
    }

    public void setWortAnzahl(long wortAnzahl) {
        this.wortAnzahl = wortAnzahl;
    }
}
