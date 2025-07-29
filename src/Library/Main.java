package Library;

public class Main {




    public static void main(String[] args) {
        Book b1 = new Book("Experimente", "Linda Raul", "963666544");
        Book b2 = new Book("Training", "Sarah Geier", "34563276987");
        Book b3 = new Book("Text schreiben", "Paola Reeb", "1235699404");
        Book [] myBooks = new Book[10];
        myBooks[0] = b1;
        myBooks[1] = b2;
        myBooks[2] = b3;

        BookManager mb = new BookManager(myBooks);
        mb.printBooks(myBooks);
        mb.searchBook("Text schreiben");
        Book b4=new Book("Montag", "Ida Lee", "754785785478457");
        mb.insertBook(b4);
        mb.printBooks(myBooks);
        mb.deleteBook("Montag");
        mb.printBooks(myBooks);

    }


}
