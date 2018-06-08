import java.util.Scanner;

public class fizzBuzz {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String [] arr = fizzBuzzFunc(1,100);

        for(int i = 1; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static String[] fizzBuzzFunc(int start, int end){
        String [] arr = new String[end + 1];
        for(int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                arr[i] = "Fizz";
            } else if (i % 5 == 0 && i % 3 != 0) {
                arr[i] = "Buzz";
            } else if (i % 3 == 0 && i % 5 == 0){
                arr[i] = "FizzBuzz";
            } else {
                arr[i] = i + " ";
            }
        }
        return arr;
    }
}
