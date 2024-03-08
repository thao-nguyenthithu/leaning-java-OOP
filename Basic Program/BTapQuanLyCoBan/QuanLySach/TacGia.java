public class TacGia {
    private String tenTacGia; 
    private NgayPhim ngaySinh;
    
    public TacGia(String tenTacGia, NgayPhim ngaySinh) {
        this.tenTacGia = tenTacGia;
        this.ngaySinh = ngaySinh;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public NgayPhim getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(NgayPhim ngaySinh) {
        this.ngaySinh = ngaySinh;
    } 

    
}
