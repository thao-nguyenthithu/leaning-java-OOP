import javax.swing.plaf.synth.SynthDesktopIconUI;

public class MainInterface {
    public static void main(String[] args) {
        System.out.println("Test 1: ");

        MTCasioFX500 mfx5 = new MTCasioFX500();
        MTVinaCal500 mvn5 = new MTVinaCal500(); 

        System.out.println("5 + 3 = " + mfx5.cong(5, 3));
        System.out.println("5 * 3 = " + mvn5.nhan(5, 3));
        System.out.println("5 / 0 = " + mfx5.chia(5, 0));
        
        System.out.println("Test 2: ");
        double[] arr = new double[] {6,4,8,0,3,9};
        InsertionSort sxchen = new InsertionSort();
        SelectionSort sxchon = new SelectionSort();

        System.out.print("Sap xep tang: ");
        sxchen.sapXepTang(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }

        System.out.print("\nSap xep giam: ");
        sxchon.sapXepGiam(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }

        System.out.print("\nTest phanmem: ");
        PhanMemMt pmmt = new PhanMemMt(); 
        System.err.println("4 + 5 = " + pmmt.cong(4,5));
    }
}
