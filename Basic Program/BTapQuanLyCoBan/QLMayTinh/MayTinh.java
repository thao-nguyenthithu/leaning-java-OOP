public class MayTinh {
    private HangSX hangMayTinh; 
    private NgaySX ngaySX; 
    private double giaBan; 
    private int tgBaoHanh;
    
    public MayTinh(HangSX hangMayTinh, NgaySX ngaySX, double giaBan, int tgBaoHanh) {
        this.hangMayTinh = hangMayTinh;
        this.ngaySX = ngaySX;
        this.giaBan = giaBan;
        this.tgBaoHanh = tgBaoHanh;
    }

    public HangSX getHangMayTinh() {
        return hangMayTinh;
    }

    public void setHangMayTinh(HangSX hangMayTinh) {
        this.hangMayTinh = hangMayTinh;
    }

    public NgaySX getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(NgaySX ngaySX) {
        this.ngaySX = ngaySX;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getTgBaoHanh() {
        return tgBaoHanh;
    }

    public void setTgBaoHanh(int tgBaoHanh) {
        this.tgBaoHanh = tgBaoHanh;
    } 

    public boolean ktGiaSoVoiMTKhac(MayTinh giaMTKhac){
        return this.giaBan < giaMTKhac.giaBan;
    }

    public String laytenQGSXMT(){
        return this.hangMayTinh.laytenQGSXMT();
    }
}
