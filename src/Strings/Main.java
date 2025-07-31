package Strings;

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {

            //Ausgabe
            System.out.println("Methode LiefereLaenge: "+liefereLaenge2("aoefndvqanfvpqeunbvaqifvfnaqifvubn"));
            System.out.println("Methode liefereZeichen: "+liefereZeichen("asdfhasvpauvnbpiauubvpaisdvdbasipduvb",15));
            System.out.println("Methode ersetzeAlle: "+ersetzeAlle("hallo",'l','x'));
            //Methode 4 - Usereingabe
            Scanner scan = new Scanner(System.in);
            System.out.printf("Bitte Wort 1 eingeben: ");
            String wort1 = scan.next();
            System.out.printf("Bitte Wort 2 eingeben: ");
            String wort2 = scan.next();
            System.out.println("Methode stringVergleicher: "+stringVergleicher(wort1, wort2));

            //Mit Array
            int[] myArray = {0,1,2,3,4,5};
            //Methode aufrufen und das Array mitübergeben
            arrayMethode(myArray);
        }

        //Methode 1
        public static int liefereLaenge1(String wort){
            return wort.length();
        }

        public static int liefereLaenge2(String wort){
            int count = 0;

            for(int i=0; i < wort.length(); i++){
                count++;
            }

            return count;
        }

        //Methode 2
        public static char liefereZeichen(String wort, int zahl){
            return wort.charAt(zahl);
        }

        //Methode 3
        public static String ersetzeAlle(String wort, char alt, char neu){
            return wort.replace(alt, neu);
        }

        //Methode 4
        public static boolean stringVergleicher(String wort1, String wort2){
            return wort1.equals(wort2);
        }

        //Die Array-Methode
        public static void arrayMethode(int[] array){
            //Summe von allen
            double summe = 0;
            for (int i=0; i<array.length;i++){
                summe += array[i];
            }

            System.out.println("Array.lengt = "+array.length);
            System.out.println("Summe des Arrays = "+summe);
            double x = summe/array.length;
            System.out.println("Mittelwert = "+x);
        }

    }

