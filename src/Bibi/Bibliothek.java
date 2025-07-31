package Bibi;
public class Bibliothek {
    private static Buch[] arrayBuecher = new Buch[3];

    //buch hinzufuegen
    public static void buchHinzufuegen(){
        arrayBuecher[0] = new Buch("titel 1", "456", "WerAucmmer", "234", true);
        arrayBuecher[1] = new Buch("titel 2", "456", "asasdfasdf", "234", true);
        arrayBuecher[2] = new Buch("titel 3", "456", "asdasgagaf", "234", true);
    }

    public static void viewBooks(){
        System.out.println("Titel\t\tAutor\t\tPublikationsdatum");
        for(Buch b : arrayBuecher){
            if(b != null){
                System.out.println(b.getTitel() + "\t\t" + b.getAutor() +"\t\t"+ b.getVeröffentlichungsdatum() +"\t\t");
            }
        }
    }

    public static void gibMirTitelDesBuchesundAutor(String gesuchterTitel){
        for (int i=0; i<arrayBuecher.length; i++){
            if(arrayBuecher[i].getTitel().equals(gesuchterTitel)){
                System.out.println("Gesuchter Titel: "+arrayBuecher[i].getTitel()+" und Autor: "+arrayBuecher[i].getAutor());
            } else {
                System.out.println("Der uebergebene Titel existiert nicht!");
            }
        }
    }

    public static void entferneBuchmitTitel(String titel){
        for (int i=0; i<arrayBuecher.length; i++){
            if(arrayBuecher[i].getTitel().equals(titel)){
                arrayBuecher[i] = null;
            } else {
                System.out.println("Der uebergebene Titel exisitert nicht!");
            }
        }
    }

    //Main-Methode
    public static void main(String[] args) {
        buchHinzufuegen();
        viewBooks();
        gibMirTitelDesBuchesundAutor("titel 2");
        entferneBuchmitTitel("titel 3");
        //um zu pruefen ob Titel entfernt wurde
        viewBooks();
    }
}

