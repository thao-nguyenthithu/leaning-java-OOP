public class SoSanhString {
    /*
    * So sanh chuoi vi du sap xep danh sach ten sinh vien
    * So sanh mat khau nguoi dung nhap voi nguoi dung da tao truoc do co bang nhau ko
    * ..
    * */

    public static void main(String[] args) {
        String s1 = "hola hola";
        String s2 = "Hola HOLA";
        String s3 = "hola hola";

        // Ham equals() =>  so sanh 2 chuoi xem co giong khau hay ko, co phan biet in hoa in thuong?
        System.out.println("s1 equals s2: " +s1.equals(s2));
        System.out.println("s1 equals s3: " + s1.equals(s3));

        // Ham equalsIgnoreCase() => ss 2 chuoi ko phan bien in hoa va in thuong.
        // equals(bang), Ignore(bo qua), Case(kieu chu).
        System.out.println("-------------------");
        System.out.println("s1 equals s2: " +s1.equalsIgnoreCase(s2));
        System.out.println("s1 equals s3: " + s1.equalsIgnoreCase(s3));

        // Ham compareTo() => ss > < = . dung de ss chuoi hoac Object.
        // comqare(so sanh), To(voi).
        String sv1 = "Nguyen Van A";
        String sv2 = "Nguyen Van B";
        String sv3 = "Nguyen Van";
        String sv4 = "Nguyen Van A";
        System.out.println("-------------------");
        System.out.println("sv1 compareTo sv2: " + sv1.compareTo(sv2));
        System.out.println("sv1 compareTo sv3: " + sv1.compareTo(sv3));
        System.out.println("sv1 compareTo sv4: " + sv1.compareTo(sv4));
//        sv1 compareTo sv2: -1     // am: sv1 nho hon sv2 theo bang ma ASCII
//        sv1 compareTo sv3: 2      // duong: sv1 lon hon sv3
//        sv1 compareTo sv4: 0      // 0 : sv1 = sv4
//        sap xep danh sach: sv3, sv1, sv4, sv2.

        // Ham compareToIgnoreCase() .. tuong tu nhu ham equalsIgnoreCase().


        // Ham regionMatches() => ss 1 doan string.
        String r1 = "thao.nguyen";
        String r2 = "ao.nguyenthi";
        boolean check = r1.regionMatches(2, r2, 0, 7);
        System.out.println("-------------------");
        System.out.println(check);
//        22010498
//        22116886
//        khi do ss xem co cung K16 hay ko, voi K16 co cung mssv 22*


        // Ham startWith() => kiem tra chuoi bat dau bang ...
        String mssv = "22010498";
        System.out.println("-------------------");
        System.out.println("Sv la K16: " + mssv.startsWith("22"));
        System.out.println("Sv la K15: " + mssv.startsWith("21"));


        //Ham endWith() => kiem tra chuoi ket thuc bang ...
        String file1 = "Hinhanh.JPG";
        String file2 = "Hoc Java.PDF";
        System.out.println("-------------------");
        if(file1.endsWith(".JPG")){
            System.out.println("File1 la file anh");
        }else if(file1.endsWith(".PDF")){
            System.out.println("File1 la file PDF");
        }
    }
}
