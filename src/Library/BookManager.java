package Library;

public class BookManager {
    public Book [] books = new Book [10];

    public BookManager(Book [] books) {
        this.books = books;
    }

    public void printBooks(Book [] books){
        System.out.println("***************************");
        System.out.println("Meine Bücher sind aufgelistet(aktueller Zustand):");
        for(int i = 0; i< books.length; i++){
            if(books[i] !=null){
                System.out.println(books[i].getAutor() + " " + books[i].getTitel());
            }
        }
        System.out.println("***************************");

        
    }

    public void searchBook(String searchTitle){

        for(int i =0; i< books.length; i++){
            if (books[i] != null && books[i].getTitel().equals(searchTitle)) {
                System.out.println("Das Buch ist gefunden!");
                System.out.println("Das Buch: " + books[i].getTitel());
                return;
            }
        }
        System.out.println("Buch nicht gefunden.");
        }


public void deleteBook(String searchTitleforDelete){

        for(int i =0; i< books.length; i++){
            if (books[i] != null && books[i].getTitel().equals(searchTitleforDelete)) {
            System.out.println("Das Buch mit diesem Titel: " + books[i].getTitel() + " ist gefunden und gelöscht!");
            books[i]=null;
            return;
            }
        }
        System.out.println("Gesuchte Buch ist gelöscht");
        for(Book b : books){
            System.out.println(b.getTitel() + "\t" + b.getAutor() + "\t" + b.getIsbn());

        }
    }




public void insertBook(Book newBook){

    for(int i =0; i< books.length; i++){
        if (books[i] == null) {
            System.out.println("Das Buch ist hinzugefügt");
            books[i]=newBook;
            return;
        }
    }
    System.out.println("Sorry, kein Platz mehr für ein neues Buch");
    for(Book b : books){
        System.out.println(b.getTitel() + "\t" + b.getAutor() + "\t" + b.getIsbn());

    }
}

}