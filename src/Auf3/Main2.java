package Auf3;

public class Main2 {

        public static void main(String[] args) {
            //Erstellen sie mir ein Array mit 8 Feldern -> int
            int[] nameVomArray = {100, 53, 32, 64, 21, 632, 19, 1};

            //Summe ausgeben
            int summe = 0;
            int groessterWert = Integer.MIN_VALUE;
            int kleinsterWert = Integer.MAX_VALUE;

            for (int i=0; i<nameVomArray.length; i++){
                //Summe aller Werte
                summe = summe + nameVomArray[i];
                //Groesster Wert
                if(nameVomArray[i] > groessterWert){
                    groessterWert = nameVomArray[i];
                }
                //Kleinster Wert
                if(nameVomArray[i] < kleinsterWert){
                    kleinsterWert = nameVomArray[i];
                }
            }

            //Ausgabe der Summe des Arrays
            System.out.println("Summe des Arrays = "+summe);
            System.out.println("Groesster Wert = "+groessterWert);
            System.out.println("Kleinster Wert = "+kleinsterWert);
            System.out.println("Durchschnitt = "+(summe/nameVomArray.length));



        }
    }


