import java.util.Scanner;

/**
 * ThapPhansangNhiPhan
 */
public class ThapPhansangNhiPhan {

    public static void main(String[] args) {
        int n; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen > 0: ");
        n = sc.nextInt();

        String nhiPhan = "";
        /*
         * Chia lien tuc cho 2 va lay phan du 
         * Dao nguoc chuoi -> kqua
         */

         while (n > 0) {
            nhiPhan = (n % 2) + nhiPhan;
            n = n / 2; 
         }

         System.out.println("He nhi phan la: " + nhiPhan);


    }
}