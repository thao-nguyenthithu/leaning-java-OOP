import java.util.Scanner;

public class TestMethodString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;

        System.out.print("Nhap vao 1 chuoi: ");
        s = sc.nextLine();

        System.out.println("-------------------------");
        System.out.println("length() - Do dai chuoi: "+ s.length());

        System.out.println("-------------------------");
        System.out.println("charAt() - Lay ra ki tu");
        for(int i = 0; i < s.length(); i++){
            System.out.println("Vi tri " + i + " la: " + s.charAt(i)) ;
        }

        System.out.println("-------------------------");
        char[] arrayChar = new char[20];
        System.out.println("getChars(vitri batdau, vitri kethuc, mang luu du lieu, vi tri bat dau luu trong mang moi) - Copy ra mang khac: ");
        s.getChars(2, 6, arrayChar, 5);
        for(int i = 0; i < arrayChar.length; i++ ){
            System.out.println("Gia tri cua mang tai " + i + " la: " + arrayChar[i]);
        }

        System.out.println("-------------------------");
        System.out.println("getBytes() - co 3 cach lay ra GIA TRI cua cac ky tu thanh 1 mang");
        byte[] arrayByte = s.getBytes();
        for(byte b: arrayByte){
            System.out.println(b); // gia tri thap phan cua ky tu trong ma ASCII
        }
    }
}
