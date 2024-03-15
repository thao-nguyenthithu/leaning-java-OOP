package vidu;

public class Main {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(120,"Nguyen Van Bay", "lop 1", 9);
        SinhVien sv2 = new SinhVien(100,"Saitama", "lop 2", 8);
        SinhVien sv3 = new SinhVien(99,"Nathan Bae", "lop 2", 8);

        System.out.println(sv1.compareTo(sv2));
        System.out.println(sv1.compareTo(sv3));

    }
}
