public class MTCasioFX500 implements CasioCalculator{

    @Override
    public double chia(double a, double b) {
        return a / b; // can bat loi b = 0 bang try-catch
    }

    @Override
    public double cong(double a, double b) {
        // TODO Auto-generated method stub
        return a + b;
    }

    @Override
    public double nhan(double a, double b) {
        // TODO Auto-generated method stub
        return a * b;
    }

    @Override
    public double tru(double a, double b) {
        return a - b; 
    }
    
}
