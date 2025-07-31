package Library;

import java.util.Scanner;

public class Main {
//TODO:Menü einbauen
static Scanner scan = new Scanner(System.in);


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
        showMenu(mb);
        mb.printBooks(myBooks);
//        mb.printBooks(myBooks);
//        mb.searchBook("Text schreiben");
//        Book b4=new Book("Montag", "Ida Lee", "754785785478457");
//        mb.insertBook(b4);
//        mb.printBooks(myBooks);
//        mb.deleteBook("Montag");
//        mb.printBooks(myBooks);

    }

    public static void showMenu(BookManager mbook) {
         int userChoise;
        System.out.println("1. Ein Buch finden");
        System.out.println("2. Ein Buch hinzufügen");
        System.out.println("3. Ein Buch löschen");
        System.out.println("4. Das Programm beenden");
        System.out.println("*************");


         do{

             userChoise = scan.nextInt();
             scan.nextLine();


             if(userChoise >=1 && userChoise<=4){
                 switch (userChoise){
                     case 1: mbook.searchBook(scan);
                     break;
                     case 2: mbook.insertBook(new Book("Montag", "Ida Lee", "754785785478457"));
                     break;
                     case 3: mbook.deleteBook(scan);
                     break;
                     case 4:
                         System.out.println("Ihre Wahl: das Program ist beendet!");
                         System.exit(0);
                     return;
                 }

             }
             else{
                 System.out.println("Inkorrekte Auswahl");
             }

         }while(true);

    }
}



