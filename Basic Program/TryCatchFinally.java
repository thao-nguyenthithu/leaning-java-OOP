import java.util.Scanner;

/**
 * TryCatchFinally
 * dùng để bắt lỗi ngoại lệ
 */
public class TryCatchFinally {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;

        try {
            System.out.print("Nhap vao so nguyen: ");
            n = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Nhap du lieu sai thi hien thi hoy!");
        } finally{ //co the co hoac ko
            System.out.println("Nhap du lieu loi hay khong van chay ne!");
        }
        
        System.out.println("Ket thuc chuong trinh");
    }
}
