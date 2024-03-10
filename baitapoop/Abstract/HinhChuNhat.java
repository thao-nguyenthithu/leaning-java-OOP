public class HinhChuNhat extends Hinh{
    double chieuR; 
    double chieuC;
    
    public HinhChuNhat(ToaDo toaDo, double chieuR, double chieuC) {
        super(toaDo);
        this.chieuR = chieuR;
        this.chieuC = chieuC;
    }

    public double getChieuR() {
        return chieuR;
    }

    public void setChieuR(double chieuR) {
        this.chieuR = chieuR;
    }

    public double getChieuC() {
        return chieuC;
    }

    public void setChieuC(double chieuC) {
        this.chieuC = chieuC;
    }

    @Override
    public double tinhS() {
        // TODO Auto-generated method stub
        return this.chieuC * this.chieuR;
    } 


}
