public class MayBay extends PhuongTienDiChuyen {
    private String loaiNhienLieu;


    public MayBay(HangSanXuat hangSX, String loaiNhienLieu) {
        super("May bay", hangSX);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVanToc() {
        // TODO Auto-generated method stub
        return 200;
    } 
  
    public void haCanh(){
        System.out.println("Ha Canh");
    }
    
}
