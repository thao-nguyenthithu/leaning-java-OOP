package lopmath;

import java.util.Scanner;

/**
 * cacham
 */
public class cacham {

    public static void main(String[] args) {
        double a, b; 
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao so a: ");
        a = sc.nextDouble(); 
        System.out.println("Nhap vao so b: ");
        b = sc.nextDouble();

        //Ham tri tuyen doi 
        System.out.println("|a| = " + Math.abs(a));

        System.out.println("Min (a,b) = " + Math.min(a,b));

        System.out.println("ceil(a) = " + Math.ceil(a)); // lam tron len

        System.out.println("floor(a) = " + Math.floor(a)); // lam tron xuong

        System.out.println(("sqrt(a) = " + Math.sqrt(a)));

        System.out.println("a^b = " + Math.pow(a, b));
    }
}