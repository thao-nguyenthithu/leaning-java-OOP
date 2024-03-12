public class LapChiMucTimkiemChuoi {
    public static void main(String[] args) {
        String s1 = "Xin chao quy vi khan gia, xin chao va Xin chao cac ban!";
        String s2 = "Xin chao";
        String s3 = "Xin chao 123";
        char c1 = 'o';

        //Ham indexOf => tim kiem tu trai qua phai
        System.out.println("Vi tri cua s2 trong s1: " + s1.indexOf(s2));
        System.out.println("s3 co nam trong s1 ko:  " + s1.indexOf(s3));
        //Cach 2
        System.out.println("Vi tri cua s2 trong s1 tinh tu vi tri thu 2 tro di: " + s1.indexOf(s2,2));
        System.out.println("Vi tri cua c1 trong s1: " + s1.indexOf(c1));
        System.out.println("Vi tri cua c1 trong s1 tinh tu vi tri 46 tro di: " + s1.indexOf(c1, 46));


        //Ham lastIndexOf => tim kiem tu phai qua trai. Phương thức lastIndexOf() trả vể chỉ số cuối của ký tự hoặc chuỗi con.
        System.out.println("Vi tri cua s2 trong s1 tu phai qua trai: " + s1.lastIndexOf(s2));


//  NOTE: Hàm lastIndexOf( ) chức năng khác hàm endsWith( )
//              lastIndexOf( ) là lấy vị trí bắt đầu của chuỗi nhỏ nằm trong chuỗi lớn, đếm từ phải qua, trả về số nguyên.
//              Còn endsWith( ) là kiểm tra xem chuổi nhỏ có nằm trong chuỗi lớn hay không trả về true false.
    }
}
