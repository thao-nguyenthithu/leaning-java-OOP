
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // get input value for number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int count = 0;

        // loop until the number becomes 0.
        // in each iteration remove last digit of number by dividing with 10
        // increase the value of count 
        do{
          number = number / 10;
          count++;
        }while(number != 0);

        // print the count outside the loop
        System.out.print(count);

        input.close();

    }
}

