import java.util.Scanner;
//TODO: 2 strings vergleichen
//TODO: 1 beliebiges Zeichen ausgeben(nach dem Kundenwunsch)
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MyStringsEx {
    static Scanner scan= new Scanner(System.in);

    public static void main(String[] args) {

        int [] myArray = {4,8,12,16,22,88};

        //User input
        String usINp = userInput();
//        stringLenght(usINp);
//        stringLenght2(usINp);
//        newString(usINp);
        stringReverse(usINp);
        //maxAndMinNumInArray(myArray);
    }

    public static String userInput(){
        System.out.println("Geben Sie ein Word oder einen Satz ein:");
        String input= scan.nextLine();
        return input;
    }


    public static int stringLenght(String input){
        int lange = input.length();
        System.out.println("Lange ist: " + lange);
        //Falls ohne Leerzeichen
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (c != ' ') {
                result.append(c);
            }
        }
        return lange;
    }

    public static int stringLenght2(String input){
        //Falls ohne Leerzeichen
        StringBuilder result = new StringBuilder();
        int counter=0;
        for (char c : input.toCharArray()) {
            if (c != ' ') {
                result.append(c);
                counter++;
            }
        }
        System.out.println("Lange ohne Leerzehchen:" + counter);
        return counter;
    }

    public static String newString(String input){
        System.out.println("Welcher Buchstabe soll ersetzt werden?");
        char oldChar = scan.next().charAt(0);

        System.out.println("Wodurch soll er ersetzt werden?");
        char newChar = scan.next().charAt(0);

        StringBuilder sb = new StringBuilder();
        for(char i : input.toCharArray()){
            if( i == oldChar){
                sb.append(newChar);
            }
            else{
                sb.append(i);
            }
        }
        System.out.println("Neu String ist: " +sb);
        return sb.toString();
    }

    public static void maxAndMinNumInArray(int []arr){


//        System.out.println("Max Value ist: " + maxValue);
//        System.out.println("Min Value ist: " + minValue);


    }

    public static void stringReverse(String string){

        //Variante 1: mit der Schleife
        String strRev = "";
        String startStrAgain = "";

        for(int i =  string.length()-1; i>=0; i--)
        {
          strRev+= string.charAt(i);
        }

        //Variante 2: mit Stringbuilder
        StringBuilder sb = new StringBuilder(string);
        sb.reverse();
        System.out.println(strRev);
        System.out.println(sb);
        //return strRev;

        //Neu Aufgabe: String wieder reversen

        for(int i = 0; i<string.length(); i++){

            startStrAgain+=string.charAt(i);
        }
        System.out.println("----------");
        System.out.println(startStrAgain);

    }

}