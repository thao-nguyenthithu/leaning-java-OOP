public class HoaDonCafe {

    /*
     * this la lay thong thi tu noi bo ben tron cai class HoaDonCafe
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

    public static void main(String[] args) {
        HoaDonCafe hd = new HoaDonCafe("Cafe Trung Nguyen", 100, 1.5);
        System.out.println("Tong tien: " + hd.tongTien());
    }

}
