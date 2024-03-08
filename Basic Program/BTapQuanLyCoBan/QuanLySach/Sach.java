public class Sach {
    
    private String tenSach; 
    private double giaSach; 
    private int namXuatBan; 
    private TacGia tacGia;

    public Sach(String tenSach, double giaSach, int namXuatBan, TacGia tacGia) {
        this.tenSach = tenSach;
        this.giaSach = giaSach;
        this.namXuatBan = namXuatBan;
        this.tacGia = tacGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public double getGiaSach() {
        return giaSach;
    }

    public void setGiaSach(double giaSach) {
        this.giaSach = giaSach;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public TacGia getTacGia() {
        return tacGia;
    }

    public void setTacGia(TacGia tacGia) {
        this.tacGia = tacGia;
    }

    public void inTenSach(){
        System.out.println(this.tenSach);
    }

    public boolean ktCungNam(Sach sachKhac){
        return this.namXuatBan == sachKhac.namXuatBan;
    }
    
    double giaSauKhiGiam(double x){
        return (1 - x/100)*this.giaSach;
    }
}
