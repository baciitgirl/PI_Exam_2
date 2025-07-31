package Arithmetics;

public class Mathe {

    public static void main(String[] args) {
        int [] numb = new int[]{1,2,3,4,5};
        System.out.println("Summ of all Elements: " + summAllElements(numb));
        System.out.println("Averadge of all Elements: " + averallElements(numb));
        findMaxAndMin(numb);
        findMinValue(numb);

    }

    public static int summAllElements(int [] numbers){
        int sum=0;
        for(int i =0; i< numbers.length; i++){
            sum+=i;
        }
        return sum;
    }

    public static int averallElements(int [] numbers){
        int sum=0;
        int aver=0;
        for(int i =0; i< numbers.length; i++){
            sum+=i;
        }
        aver = sum/ numbers.length;
        return aver;
    }

    public static void findMaxAndMin(int [] numbers){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i< numbers.length; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }

            if(numbers[i] > max){
                max= numbers[i];
            }
        }

        System.out.println("Min in Array ist: " + min);
        System.out.println("Max in Array ist: " + max);

    }


    public static void findMinValue(int [] numbers){

        int min=numbers[0];
        int minIndex=0;

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] < min){
                min= numbers[i];
                minIndex = numbers[i];
            }
        }

            System.out.println("Minimum ist: " + min + "Index : " + minIndex);
        }


}
