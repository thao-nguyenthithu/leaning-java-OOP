public class MainPhim {
    public static void main(String[] args) {
        NgayPhim ngay1 = new NgayPhim(07, 03, 2024); 
        NgayPhim ngay2 = new NgayPhim(8, 03, 2024); 

        HangPhim hang1 = new HangPhim("sony", "USA"); 
        HangPhim hang2 = new HangPhim("Gibli", "Nhat Ban");

        Phim phim1 = new Phim("Chung ta cua tuong lai", 2024, hang1, 180, ngay1);
        Phim phim2 = new Phim("Quoc te PN", 2023, hang2, 80, ngay2);

        System.out.println("SS gia ve phim 1 va 2 xem 1 co re hon 2 ko: " + phim1.ktGiaVeRe(phim2));
        
        System.out.println("Ten hang san xua BP 1: " + phim1.tenHangPhim());

        System.out.println("Gia  phim1 sau khuyen mai 10%: "+ phim1.giaVeSauKhiGiam(10));
    
    }
}
