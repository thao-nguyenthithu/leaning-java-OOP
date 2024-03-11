
public class SelectionSort implements SapXepInterface{

    @Override
    public void sapXepGiam(double[] arr) {
        int n = arr.length; 
        int i, j, min_s; 
        for (i = 0; i< n - 1; i++){
            min_s = i;
            for(j = i + 1; j < n; j++){
                if(arr[j] > arr[min_s]){
                    min_s = j;
                }
            }
            double temp = arr[min_s];
            arr[min_s] = arr[i];
            arr[i] = temp;
        }
    }

    @Override
    public void sapXepTang(double[] arr) {
        int n = arr.length; 
        int i, j, min_s; 
        for (i = 0; i< n - 1; i++){
            min_s = i;
            for(j = i + 1; j < n; j++){
                if(arr[j] < arr[min_s]){
                    min_s = j;
                }
            }
            double temp = arr[min_s];
            arr[min_s] = arr[i];
            arr[i] = temp;
        }
        
    }
    
}
