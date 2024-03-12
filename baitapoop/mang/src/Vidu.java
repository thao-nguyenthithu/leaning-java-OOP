import java.lang.reflect.Array;
import java.util.Arrays;

public class Vidu {
    public static void main(String[] args) {
        //kieu nguyen thuy
        int[] mang1 = {1,2,3};

        // Copy mang cach 1
        int[] mang1a = mang1;
        mang1a[0] = 100;
        System.out.println("Mang 1: " + Arrays.toString(mang1));
        System.out.println("Mang 1a: " + Arrays.toString(mang1a));

        //Copy mang cach 2 - dung ham clone
        int[] mang1b = mang1.clone();
        mang1b[0] = 50;
        System.out.println("Mang 1: " + Arrays.toString(mang1));
        System.out.println("Mang 1b: " + Arrays.toString(mang1b));

        //Copy mang cach 3 - dung System.arraycopy
        int[] mang1c = new int[mang1.length];
        System.arraycopy(mang1,0, mang1c, 0, mang1.length);
        mang1c[0] = 90;
        System.out.println("Mang 1: " + Arrays.toString(mang1));
        System.out.println("Mang 1c: " + Arrays.toString(mang1c));


        //Kieu du lieu Object
        String[] mangObject = {"abc", ".vn"};
    }
}
