package Auf3;

public class Main {

        public static void main(String[] args) {
            //Ein Studiumjahrgangs-Array, jeder Wert steht für die Anzahl der Studierenden pro Jahrgang, es gibt insgesamt 5 Jahrgänge
            //-> Array hat 5 Felder
            double[] jahrgang = {11, 34, 55, 73, 40}; //Studierende pro Jahrgang

            //Mittelwert/Durchschnitt aller Studierenden berechnen
            double summe = 0;
            for (int i=0; i<jahrgang.length; i++){
                summe += jahrgang[i]; //summe = summe + jahrgang[i]
            }
            double mittelwert = summe/jahrgang.length;
            System.out.println("Durchschnitt aller = "+mittelwert);



            //Wie viele Jahrgänge haben mehr als 40 Personen und wie viele haben weniger als 20 Personen?
            int alleUeber40 = 0;
            int alleUnter20 = 0;

            for (int i=0; i<jahrgang.length; i++){
                if(jahrgang[i] > 40){
                    alleUeber40++;
                } else if (jahrgang[i] < 20) {
                    alleUnter20++;
                }
            }
            //Ausgabe
            System.out.println("Alle ueber 40: "+alleUeber40+" | alle unter 20: "+alleUnter20);



            //Ermitteln Sie mir den Jahrgang mit den meisten Studierenden und den Jahrgang mit der kleinsten Studierendenanzahl
            double max = Double.MIN_VALUE;
            double min = Double.MAX_VALUE;

            double jahrgangMitGroessterAnzahlAnStudierenden = 0;
            double jahrgangMitKleinsterAnzahlAnStudierenden = 0;

            for (int i=0; i<jahrgang.length; i++){
                if(jahrgang[i] < min){
                    //Speichern der Studierendenanzahl
                    min = jahrgang[i];
                    //Es handelt sich um den folgenden Jahrgang
                    jahrgangMitKleinsterAnzahlAnStudierenden = i+1;
                } else if(jahrgang[i] > max){
                    //Speichern der Studierendenanzahl
                    max = jahrgang[i];
                    //Es handelt sich um den folgenden Jahrgang
                    jahrgangMitGroessterAnzahlAnStudierenden = i+1;
                }
            }
            //Ausgabe
            System.out.println("Jahrgang mit groesster Anzahl an Studierenden: "+jahrgangMitGroessterAnzahlAnStudierenden+" - die Anzahl ist "+max
                    +" | Jahrgang mit kleinser Studierendenanzahl: "+jahrgangMitKleinsterAnzahlAnStudierenden+" - die Anzahl ist "+min);

        }
    }


