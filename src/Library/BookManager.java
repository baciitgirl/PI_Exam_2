package Library;

import java.util.Scanner;

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

    public void searchBook(Scanner scan){
        System.out.println("Geben Sie ein Titel ein:");
        String searchTitle = scan.nextLine();


        for(int i =0; i< books.length; i++){
            if (books[i] != null && books[i].getTitel().equals(searchTitle)) {
                System.out.println("Das Buch ist gefunden!");
                System.out.println("Das Buch: " + books[i].getTitel());
                return;
            }
        }
        System.out.println("Buch nicht gefunden.");
        }


public void deleteBook(Scanner scan){
    System.out.println("Welches Buch möchten Sie ausleihen?");
     String searchTitleforDelete = scan.nextLine();
        boolean found = false;
        for(int i =0; i< books.length; i++) {
            if(books[i] != null && books[i].getTitel().equalsIgnoreCase(searchTitleforDelete)) {
                System.out.println("Das Buch mit diesem Titel: " + books[i].getTitel() + " ist gefunden und gelöscht!");
                System.out.println("Gesuchte Buch " + books[i].getTitel() + " ist gelöscht");
                books[i] = null;
                found = true;
                break;
            }
        }
            if(!found){
                System.out.println("Kein Buch mit diesem Titel gefunden");
            }
            printActuallBooks(books);
        }



public void insertBook(Book newBook){

    for(int i =0; i< books.length; i++){
        if (books[i] == null) {
            System.out.println("Das Buch ist hinzugefügt");
            books[i]=newBook;
            printActuallBooks(books);
            return;
        }
    }
    System.out.println("Sorry, kein Platz mehr für ein neues Buch");

}

    public static void printActuallBooks(Book [] books){
        System.out.println("Aktuelle Liste:");
        for(Book b : books){
            if(b !=null)
                System.out.println(b.getTitel() + "\t" + b.getAutor() + "\t" + b.getIsbn());
        }
    }

}