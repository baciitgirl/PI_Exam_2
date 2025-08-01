package Arithmetics;

public class Mathe {

    public static void main(String[] args) {
        int[] numb = new int[]{1, 2, 3, 4, 5};
        int[] numb2 = new int[]{1, 2, 3, 4, 5, 18, -5, -8, 100 };
        System.out.println("Summ of all Elements: " + summAllElements(numb));
        System.out.println("Averadge of all Elements: " + averallElements(numb));
//        findMaxAndMin(numb);
//        findMinValue(numb);
//        findMaxValue(numb);
        //arrayReverse(numb);
        //fakultaetBerechnen(numb);
        //fibonacci(20);
        //geradeUndUngerade(numb2);
        //sumFirstXFibonacci(5);
        getFibonacciAt(2);

    }

    public static int summAllElements(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static int averallElements(int[] numbers) {
        int sum = 0;
        int aver = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += i;
        }
        aver = sum / numbers.length;
        return aver;
    }

    public static void findMaxAndMin(int[] numbers) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Min in Array ist: " + min);
        System.out.println("Max in Array ist: " + max);

    }


    public static void findMinValue(int[] numbers) {
        int min = numbers[0];
        int minIndex = 0;
        if (numbers == null || numbers.length == 0) {
            System.out.println("Array ist leer!");
            return;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }
        }
        System.out.println("Minimum ist: " + min + " Index : " + minIndex);
    }

    public static void findMaxValue(int [] numbers){

        int max = 0;
        int maxIndex=0;
        //Check if Array is empty
        if(numbers==null || numbers.length==0){
            System.out.println("Array is empty");

        }
        for(int i = 0; i< numbers.length; i++){
            if(numbers[i] >max){
                max=numbers[i];
                maxIndex=i;
            }
        }
        System.out.println("Max number in Array is: " + max + " at index: " + maxIndex);
    }

    public static void arrayReverse( int[] numb){
        for(int i = numb.length-1; i >= 0; i--){
            System.out.print(numb[i] + " ");
        }
    }

    public static void fakultaetBerechnen(int [] numb){
        int fakult=1;
        if(numb !=null && numb.length!=0){
            for(int i=0; i<numb.length; i++){
                fakult *=numb[i];
            }
            System.out.println("Fakultät ist: " +fakult);
        }
    }

    public static void fibonacci(int n){
        int firstFib= 0;
        int secondFib = 1;
        int sumTemp =0;
        System.out.print("Fibonacci: ");
        while(firstFib < n){
            System.out.print(firstFib + " ");
            sumTemp = firstFib+secondFib;
            firstFib = secondFib;
            secondFib=sumTemp;
        }
    }

    public static void geradeUndUngerade(int[] num){
        if(num !=null && num.length !=0) {
            System.out.println("Gerade Zahlen: ");
            for (int i = 0; i < num.length; i++) {
                if (num[i] % 2 == 0) {
                    System.out.print(num[i] + " ");
                }
            }
            System.out.println("\nUngerade Zahlen:");
            for (int i = 0; i < num.length; i++) {
                if (num[i] % 2 != 0) {
                    System.out.print(num[i] + " ");
                }
            }
        }
        else
                System.out.println("Array ist leer");

    }

    public static void sumFirstXFibonacci(int n){

        //1. Fibonacci bis n inkl.

        int first=0;
        int second = 1;
        int temp=0;
        int sum=0;

        System.out.print("Erste " + n + "Fibonacci Zahlen: ");
        while(first<n){
            System.out.print(first + " ");
            sum +=first;
            temp=first+second;
            first=second;
            second=temp;
        }
        System.out.println("\nSumme der ersten " + n + " Fibonacci-Zahlen: " + sum);
    }

    public static int getFibonacciAt(int index) {
        if (index == 0) return 0;
        if (index == 1) return 1;
        int[] fib = new int[index + 1]; // Array bis zum gewünschten Index
        fib[0] = 0;
        fib[1] = 1;
        int result=0;
        for (int i = 2; i <= index; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            result = fib[i];
        }
        System.out.println("Fibonacci-Zahl an Index " + index + " ist: " + result);
        return fib[index];
    }
}
