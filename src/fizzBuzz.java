import java.util.Random;
import java.util.Scanner;

public class fizzBuzz {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        //String [] arr = fizzBuzzFunc(1,100);

        String [] arr = fizzBuzzFunc(rand.nextInt(100), rand.nextInt(100));

        for(int i = 1; i < arr.length; i++){
            if(arr[i] != null){
            System.out.println(i + " " + arr[i]);}
        }
    }
    public static String[] fizzBuzzFunc(int start, int end){
        String [] arr = new String[end + 1];

        if(end - start < 10){
            System.out.println("This won't take too long");
        }

        for (int i = start; i <= end; i++) {
                if( start == end){
                    arr[i] = "Shazam!!";
                    break;
                }
                if (i % 3 == 0 && i % 5 != 0) {
                    arr[i] = "Fizz";
                } else if (i % 5 == 0 && i % 3 != 0) {
                    arr[i] = "Buzz";
                } else if (i % 3 == 0 && i % 5 == 0) {
                    arr[i] = "FizzBuzz";
                }
        }
        return arr;
    }
}
