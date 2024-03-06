package lopmath;

import java.util.Scanner;

/**
 * baitapHinhTron
 */
public class baitapHinhTron {

    public static void main(String[] args) {
        double r, s, c; 

        Scanner sc = new Scanner(System.in);
         
        System.out.println("Nhap ban kinh r : " );
        r = sc.nextDouble(); 

        c = 2 * Math.PI * r;
        System.out.println("Chu vi = " + c);
        System.out.println("Lam tron chu vi = " + Math.round(c));

        //Lay 2 so sau dau phay
        System.out.println("Lam tron 2 dau phay chu vi = " + Math.round(c*100.0)/100.0);

        s = Math.PI * Math.pow(r,2);
        System.out.println("Dien tich = " + s);
    }
}