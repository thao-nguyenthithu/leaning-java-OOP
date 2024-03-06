import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void maxMin(ArrayList<Integer> numbers){
        int max = numbers.get(0);
        int min = numbers.get(0);

        for(int i : numbers){
            if(i > max){
                max = i;
            }
            if(i < min){
                min = i;
            }
        }

        System.out.println("So lon nhat trong mang la: " + max);
        System.out.println("So be nhat trong mang la: " + min);
    }

    public static void trungBinh(ArrayList<Integer> numbers){
        int sum = 0; 
        for(int i : numbers){
            sum += i;
        }

        System.out.println("Trung binh cong cua 20 so la: " + (float)sum / 20);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0; i < 20; i++){
            numbers.add((int)(Math.random() * 100));
            System.out.println("Number " + i + " = " + numbers.get(i));
        }

        System.out.println("-----------------------------------");
        System.out.println("Nhap 1 - Tim gia tri lon nhat va be nhat trong mang.");
        System.out.println("Nhap 2 - Tinh gia tri trung binh cong cua cac phan tu trong mang.");
        
        System.out.print("Nhap vao lua chon cua ban: ");
        Scanner input = new Scanner(System.in);
        int myOption;

        do{
            myOption = input.nextInt();
            
            switch (myOption) {
                case 1:
                    maxMin(numbers);
                    break;
                case 2: 
                    trungBinh(numbers);
                    break;
                default:
                    System.out.print("Nhap sai, vui long nhap lai: ");
            }
        }while(myOption != 1 && myOption != 2);
        
        input.close();
    }
}
