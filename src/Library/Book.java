package Library;

public class Book {

    private String title;
    private String autor;
    private String isbn;

    public Book(String titel, String autor, String isbn) {
        this.title = titel;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getTitel() {
        return title;
    }

    public void setTitel(String titel) {
        this.title = titel;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
