public class Phim {
    private String tenPhim; 
    private int namSX; 
    private HangPhim hangSX; 
    private double giaVe; 
    private NgayPhim ngayChieu;
    
    public Phim(String tenPhim, int namSX, HangPhim hangSX, double giaVe, NgayPhim ngayChieu) {
        this.tenPhim = tenPhim;
        this.namSX = namSX;
        this.hangSX = hangSX;
        this.giaVe = giaVe;
        this.ngayChieu = ngayChieu;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public HangPhim getHangSX() {
        return hangSX;
    }

    public void setHangSX(HangPhim hangSX) {
        this.hangSX = hangSX;
    }

    public double getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }

    public NgayPhim getNgayChieu() {
        return ngayChieu;
    }

    public void setNgayChieu(NgayPhim ngayChieu) {
        this.ngayChieu = ngayChieu;
    } 

    public boolean ktGiaVeRe(Phim vePhimKhac){
        return this.giaVe < vePhimKhac.giaVe;
    }

    public String tenHangPhim(){
        return this.hangSX.getTenHangPhim();
    }

    public double giaVeSauKhiGiam(double x){
        return (1 - x/100)* this.giaVe;
    }


}
