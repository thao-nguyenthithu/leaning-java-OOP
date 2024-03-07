public class HoaDonCafe {

    /*
     * this lấy thông tin từ nội bộ bên trong class đang làm việc
     * 
     */
    private String tenLoaiCafe; 
    private double giaTien1kg, khoiLuong; 

    public HoaDonCafe(String ten, double gia, double kl){
        this.tenLoaiCafe = ten; 
        this.giaTien1kg = gia; 
        this.khoiLuong = kl; 
    }

    public double tongTien(){
        return this.giaTien1kg * this.khoiLuong;

    }

    public boolean kiemtraKLLonHon(double kl){
        return this.khoiLuong > kl;
    }

    public boolean kiemtraTongTienLonHon500k(){
        return this.tongTien() > 500;
    }

    //giam gia x% nhap tu ban phim
    public double giamGia(double x){
        if(this.tongTien() > 500){
            return (x/100) * this.tongTien();
        }
        return 0;
    }

    public double giaSauKhiGiam(double x)
{
    return this.tongTien() - this.giamGia(x);
}
    public static void main(String[] args) {
        HoaDonCafe hd = new HoaDonCafe("Cafe Trung Nguyen", 100, 5.5);
        System.out.println("Tong tien: " + hd.tongTien());

        System.out.println("Kiem tra khoi luong lon hon 2kg: " + hd.kiemtraKLLonHon(2));
        System.out.println("Kiem tra tong tien > 500k: " + hd.kiemtraTongTienLonHon500k());
        System.out.println("Giam gia cua HD: " + hd.giamGia(10));
        System.out.println("Tien tra sau khi giam gia: " + hd.giaSauKhiGiam(10));
    }

}
