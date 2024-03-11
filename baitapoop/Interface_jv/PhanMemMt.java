public class PhanMemMt implements CasioCalculator, SapXepInterface{

    @Override
    public double chia(double a, double b) {
        // TODO Auto-generated method stub
        return a/b;
    }

    @Override
    public double cong(double a, double b) {
        // TODO Auto-generated method stub
        return a + b;
    }

    @Override
    public double nhan(double a, double b) {
        // TODO Auto-generated method stub
        return a*b;
    }

    @Override
    public double tru(double a, double b) {
        // TODO Auto-generated method stub
        return a-b;
    }

    @Override
    public void sapXepGiam(double[] arr) {
        int n = arr.length; 
        double key;
        int i, j; 
        for(i = 1; i < n; i++){
            key = arr[i];
            j = i - 1; 

            while(j >= 0 && arr[i] < key){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    @Override
    public void sapXepTang(double[] arr) {
        int n = arr.length; 
        double key;
        int i, j; 
        for(i = 1; i < n; i++){
            key = arr[i];
            j = i - 1; 

            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    
}
