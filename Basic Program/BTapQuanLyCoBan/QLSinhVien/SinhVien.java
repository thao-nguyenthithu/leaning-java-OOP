public class SinhVien {
    private int MSSV; 
    private String hoTenSV; 
    private NgaySinh ngaySinh; 
    private double diemTB; 
    private Lop lop;
    
    public SinhVien(int mSSV, String hoTenSV, NgaySinh ngaySinh, double diemTB, Lop lop) {
        MSSV = mSSV;
        this.hoTenSV = hoTenSV;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
        this.lop = lop;
    }

    public int getMSSV() {
        return MSSV;
    }

    public void setMSSV(int mSSV) {
        MSSV = mSSV;
    }

    public String getHoTenSV() {
        return hoTenSV;
    }

    public void setHoTenSV(String hoTenSV) {
        this.hoTenSV = hoTenSV;
    }

    public NgaySinh getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(NgaySinh ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    } 

    public String layTenKhoa(){
        return this.lop.getTenKhoa();
    }

    public boolean ktSVDau(){
        return this.diemTB > 5.5;
    }

    public boolean ktNgaySinhSV(SinhVien ngaySinhSVKhac){
        return this.ngaySinh.equals(ngaySinhSVKhac.ngaySinh);
    }
    
}
