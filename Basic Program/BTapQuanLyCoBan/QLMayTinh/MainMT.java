public class MainMT {
    public static void main(String[] args) {
        NgaySX ngay1 = new NgaySX(8, 3, 2024); 
        NgaySX ngay2 = new NgaySX(1, 3, 2024);
        NgaySX ngay3 = new NgaySX(10, 12, 2025);

        QuocGia qg1 = new QuocGia(123, "USA"); 
        QuocGia qg2 = new QuocGia(84, "Viet Nam"); 
        QuocGia qg3 = new QuocGia(89, "Duc");

        HangSX hang1 = new HangSX("Mac", qg1); 
        HangSX hang2 = new HangSX("Vin", qg2);
        HangSX hang3 = new HangSX("Asus", qg3);

        MayTinh mt1 = new MayTinh(hang1, ngay1 , 5000, 24);
        MayTinh mt2 = new MayTinh(hang2, ngay2, 2000, 12);
        MayTinh mt3 = new MayTinh(hang3, ngay3, 3500, 12);

        System.out.println("So sanh gia mt1 thap hon m2: " + mt1.ktGiaSoVoiMTKhac(mt2));
        System.out.println("So sanh gia mt2 thap hon m3: " + mt2.ktGiaSoVoiMTKhac(mt3));
        
        System.out.println("Ten quoc gia: ");
        System.out.println("m1: " + mt1.laytenQGSXMT());
        System.out.println("m2: " + mt2.laytenQGSXMT());
        System.out.println("m2: " + mt3.laytenQGSXMT());
    }
}
