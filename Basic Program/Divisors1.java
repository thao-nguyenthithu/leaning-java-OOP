import java.util.Scanner;

public class Divisors1 {
    public static void main(String[] args) {

        // get input value for number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //run a loop from i = 1 to i < number
        for(int i = 1; i < number; i++){

            // check if number is divisible by i
            if(number % i == 0){
                System.out.println(i);
            }
        }

        // close Scanner
        input.close();
    }
}