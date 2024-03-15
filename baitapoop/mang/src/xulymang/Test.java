package xulymang;

import java.util.Arrays;

public class Test {

    public static int[] reverse(int[] x){
        int[] rs = new int[x.length];
        int index = 0;
        for(int i = x.length - 1; i >= 0; i--){
            rs[index] = x[i];
            index++;
        }
        return rs;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,8,2,6,4,3,7,9};
        int[] b = new int[15];

        //Ham tim kiem binarySearch() - chi dung cho cai mang da sap xep tang dan.
        System.out.println(Arrays.binarySearch(a,4));
        System.out.println(Arrays.binarySearch(a,-1));

        System.out.println("a ban dau: " + Arrays.toString(a));
        // Ham sap xep tang dan
        Arrays.sort(a);
        System.out.println("a sap xep tang dan: " + Arrays.toString(a));
        System.out.println(Arrays.binarySearch(a,4));
        System.out.println(Arrays.binarySearch(a,-1));

        //Ham dien gia tri cho mang
        Arrays.fill(b,5);
        System.out.println("b: " + Arrays.toString(b));

        // sap xep giam dan
        Arrays.sort(a);
        a = Test.reverse(a);
        System.out.println("a sap xep giam dan: " + Arrays.toString(a));
    }
}
