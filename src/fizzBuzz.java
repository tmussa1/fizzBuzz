import java.util.Random;
import java.util.Scanner;

public class fizzBuzz {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        //String [] arr = fizzBuzzFunc(1,100);

        String [] arr = fizzBuzzFunc(rand.nextInt(100), rand.nextInt(100));

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != null){
            System.out.println(arr[i]);}
        }
    }
    public static String[] fizzBuzzFunc(int start, int end){
        String [] arr = new String[end + 1];

        if(end - start < 10 && start < end){ //if difference is less than 10
            arr[0] = "This won't take too long";
        }
        
        for (int i = start; i <= end; i++) {
                if( start == end){
                    arr[i] = "Shazam!!";
                    break;
                }
                if (i % 3 == 0 && i % 5 != 0) {
                    arr[i] = "Fizz"; //for multiples of 3
                } else if (i % 5 == 0 && i % 3 != 0) {
                    arr[i] = "Buzz"; //for multiples of 5
                } else if (i % 3 == 0 && i % 5 == 0) {
                    arr[i] = "FizzBuzz"; //for multiples of both 3 and 5
                } else if(i % 7 == 0){
                    arr[i] = i + "- multiple of seven"; //for multiple of seven
                } else {
                    arr[i] = i + " ";
                }
        }

        /*
        Bonus
         */
        int k = start % 2 == 0 ? start : start + 1; //assign k to the first even number close to the start if start is not even
        String [] RockSci = new String[]{"Rock","Paper","Scissors", "Lizard", "Spock"};
        int i = 0;
        while(k <= end){
            if(k >= 10 && k % 2 == 0){
                arr[k] = arr[k] + " " + RockSci[i++ % 5]; //append for K bigger than 10 and even
            }
                k += 2;
        }

        return arr;
    }
}
