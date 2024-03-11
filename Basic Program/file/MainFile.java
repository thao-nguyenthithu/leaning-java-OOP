import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.awt.desktop;

public class MainFile {
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException{
        
        List<Integer> listRandomNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            listRandomNumbers.add(random.nextInt());
        }

        
        List<Integer> listPrimeNumbers = new ArrayList<>();
        for (int number : listRandomNumbers) {
            if (isPrime(number)) {
                listPrimeNumbers.add(number);
            }
        }

        File file = new File("D:\\Workspace\\learning-java-OOP\\Basic Program\\file\\output.txt");
        FileWriter fileWriter = new FileWriter(file);

        
        fileWriter.write("Dong 1: ");
        for (int randomNumber : listRandomNumbers) {
            fileWriter.write(randomNumber + " ");
        }
        fileWriter.write("\n");
        fileWriter.write("Dong 2: ");
        for (int primeNumber : listPrimeNumbers) {
            fileWriter.write(primeNumber + " ");
        }

        fileWriter.close();

        System.out.println("Da luu vao file output.txt");
    }

}



