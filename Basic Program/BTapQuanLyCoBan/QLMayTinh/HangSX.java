public class HangSX {
    private String tenHangSX; 
    private QuocGia quocGiaSX;
    
    public HangSX(String tenHangSX, QuocGia quocGiaSX) {
        this.tenHangSX = tenHangSX;
        this.quocGiaSX = quocGiaSX;
    }

    public String getTenHangSX() {
        return tenHangSX;
    }

    public void setTenHangSX(String tenHangSX) {
        this.tenHangSX = tenHangSX;
    }

    public QuocGia getQuocGiaSX() {
        return quocGiaSX;
    }

    public void setQuocGiaSX(QuocGia quocGiaSX) {
        this.quocGiaSX = quocGiaSX;
    } 

    public String laytenQGSXMT(){
        return this.quocGiaSX.getTenQG();
    }
    
}
