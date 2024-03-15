package vidu;

//DUNG DE SS 2 DOI TUONG.

public class SinhVien implements Comparable<SinhVien> {
    private int maSinhVien;
    private String hoVaTen;
    private  String tenLop;
    private double diemTrungBinh;

    public SinhVien(int maSinhVien, String hoVaTen, String tenLop, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.tenLop = tenLop;
        this.diemTrungBinh = diemTrungBinh;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getTen(){
        String s = this.hoVaTen.trim(); // xoa di khoang trang 2 dau
        if(s.indexOf(" ") >= 0){
            int vt = s.lastIndexOf(" ");
            return s.substring(vt+1);
        }else{
            return s;
        }
    }
    @Override
    public int compareTo(SinhVien o) {
        //<0: SV1 < SV2
        //=0
        //>0
        //return this.maSinhVien - o.maSinhVien;

        //dua tren ss TEN
        //Vidu: Saitama, Nathan Try, Nguyen Van A, Mai Troi Se Sang...
        String tenThis = this.getTen();
        String tenO = o.getTen(); // ten doi tuong duoc truyen vao (o)

        return tenThis.compareTo(tenO);

    }
}
