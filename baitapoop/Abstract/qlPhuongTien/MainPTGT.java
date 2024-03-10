public class MainPTGT {
    public static void main(String[] args) {
        HangSanXuat h1 = new HangSanXuat("ABC", "vietnam"); 
        HangSanXuat h2 = new HangSanXuat("A---", "Nhat ban"); 
        HangSanXuat h3 = new HangSanXuat("v--", "usa"); 
       
        //PhuongTienDiChuyen p1 = new MayBay(null, h1, "Xang"); // ko lay duoc phuong thuc haCanh();

        MayBay p1 = new MayBay( h1, "Xang1");
        PhuongTienDiChuyen p2 = new XeOto(h2, "Xang");
        PhuongTienDiChuyen p3 = new XeDap(h3);

        System.out.println("Lay hang san xuat: ");
        System.out.println(p1.layTenHangSanXuat());

        //....
        System.out.println("Lay van toc");
        System.out.println(p1.layVanToc());
        System.out.println(p2.layVanToc());
        System.out.println(p3.layVanToc());
        

        p1.haCanh();
    }
}
