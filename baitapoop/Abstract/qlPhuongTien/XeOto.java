public class XeOto extends PhuongTienDiChuyen {
    private String loaiNhienLieu;



    public XeOto(HangSanXuat hangSX, String loaiNhienLieu) {
        super("Xe oto", hangSX);
        this.loaiNhienLieu = loaiNhienLieu;
    }



    @Override
    public double layVanToc() {
        // TODO Auto-generated method stub
        return 50;
    } 

    
}
