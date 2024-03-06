import java.util.Scanner;

/**
 * mang1
 */
public class mang1 {

    public static void main(String[] args) {
        double[] mang1; // cach 1
        double mang2[]; // cach 2

        mang1 = new double[10];
        mang2 = new double[]{1,2,3,4,5};

        Scanner sc = new Scanner(System.in); 
        for(int i = 0; i < mang1.length; i++){
            System.out.print("Nhap phan tu thu " + i + ": ");
            mang1[i] = sc.nextDouble(); 
        }
        
        double tong = 0; 
        for (int i = 0; i < mang2.length; i++) {
            tong += mang2[i];
        }
         System.out.println("Tong la: " + tong);
    }
}