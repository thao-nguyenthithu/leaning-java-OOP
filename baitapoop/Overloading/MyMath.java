public class MyMath {
    public double sum(double a, double b){
        return a + b; 
    }

    public double sum(double[] arr){ 
        double s = 0; 
        for(int i = 0 ; i < arr.length; i++){
            s += arr[i];
        }
        return s;
    }

    public static void main(String[] args) {
        MyMath m = new MyMath(); 
        System.out.println("a + b = "+ m.sum(3.5 , 6.0));

        double arr[] = new double[] {1,2,3,4,5};
        System.out.println("tong array = " + m.sum(arr));
    }
}
