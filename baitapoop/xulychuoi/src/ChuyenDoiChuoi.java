public class ChuyenDoiChuoi {
    public static void main(String[] args) {
        String s1 = "VTVgo";
        String s2 = ".vn";

        // Ham concat => noi chuoi
        String s3 = s1.concat(s2); // s1 ko he thay doi chuoi
        System.out.println("s3 = " + s3);

        //Ham replace => thay the, thay doi.
        String s5 = "24h.vn";
        String s6 = s5.replaceAll("24h","ChuyenDong24h");
        System.out.println(s5);
        System.out.println(s6);


        // Ham toLowerCase => chuyen ve viet thuong
        // Ham toUpperCase => chuyen ve viet Hoa
        System.out.println(s6.toLowerCase());
        System.out.println(s6.toUpperCase());


        //Ham trim() => xoa bo khoang trang o 2 dau chuoi.
        String s9 = "       Du khoang trang    ";
        System.out.println(s9.trim());

        //Ham toCharArray() => chuyen doi 1 chuoi ve thanh 1 mang cac ki tu


        //Ham subString() => cat chuoi con
        String s10 = "Xin chao cac ban VTVgo.vn";
        System.out.println(s10.substring(10));
        System.out.println(s10.substring(10,15));
    }

}
