package main;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
/*
 * Người chơi đặt cược số tiền ít hơn hoặc bằng số tiền họ có.
 * Luật chơi:
 * - Có 3 viên xúc xắc. Mỗi lần lắc ra 1 kqua.
 * - kq = xx1 + xx2 + xx3.
 * 1. Nếu tổng = 3  hoặc 18 => cái ăn hết, ng chơi thua.
 * 2. Nếu tổng = (4->10) -> xỉu => nếu ng chơi đặt xỉu thì thắng, ngược lại.
 * 3. Nếu tổng = (11->17) -> tài => nếu ng chơi đặt tai thì thắng, ngược lại.
 */
public class TaiXiu {
    public static void main(String[] args) {
        double taiKhoanNguoiChoi = 5000000;

        int luaChon = 0;
        Scanner sc = new Scanner(System.in);

        Locale lc = new Locale("en","US");
        //Locale lc = new Locale("vi","VN");
        //NumberFormat numf = NumberFormat.getInstance(lc); // định dạng con số theo kiểu quốc gia việt nam
        NumberFormat numf = NumberFormat.getCurrencyInstance(lc); // định dạng kiểu 5.000 đ hoặc $...

        do{
            System.out.println("------------LUA CHON CUA BAN--------------");
            System.out.println("Chon (1) de tiep tuc choi.");
            System.out.println("Chon (phim bat ki) de thoat.");
            luaChon = sc.nextInt();

            if (luaChon == 1){
                System.out.println("*** Bat dau choi *** ");
                System.out.println("*** Tai khoan cua ban: " + numf.format(taiKhoanNguoiChoi) + " ban muon cuoc bao nhieu?");

                double datCuoc = 0;
                do{
                    System.out.print("*** Dat cuoc ( 0 < so tien cuoc <= " + numf.format(taiKhoanNguoiChoi) + " ): ");
                    datCuoc = sc.nextDouble();
                }while (datCuoc <= 0 || datCuoc > taiKhoanNguoiChoi );

                int luaChonTaiXiu = -1;
                do{
                    System.out.println("*** Chon 1-Tai hoac Chon 2-Xiu " );
                    luaChonTaiXiu = sc.nextInt();
                }while (luaChonTaiXiu != 1 && luaChonTaiXiu != 2 );

                //Tung xuc xac
                Random xucXac = new Random();

                int giaTri1 = xucXac.nextInt(5) + 1; // random tu 1 - 6. neu nextInt(6) gia tri la (0-6)
                int giaTri2 = xucXac.nextInt(5) + 1; // random tu 1 - 6. neu nextInt(6) gia tri la (0-6)
                int giaTri3 = xucXac.nextInt(5) + 1; // random tu 1 - 6. neu nextInt(6) gia tri la (0-6)

                //Tinh
                int sum1 = giaTri1 + giaTri2 + giaTri3;
                System.out.println("*** Ket qua: " + giaTri1 + " + " + giaTri2 + " + " + giaTri3 + " = " + sum1);
                if(sum1 == 3 || sum1 == 18){
                    System.out.println("*** Ban thua cuoc!");
                    taiKhoanNguoiChoi -= datCuoc;
                    System.out.println("*** Tai khoan cua ban la: " +numf.format(taiKhoanNguoiChoi) );
                }else if(sum1 >= 4 && sum1 <= 10){
                    if(luaChonTaiXiu == 2){
                        System.out.println("*** Ban thang cuoc!");
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("*** Tai khoan cua ban la: " + numf.format(taiKhoanNguoiChoi) );
                    }else {
                        System.out.println("*** Ban thua cuoc!");
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("*** Tai khoan cua ban la: " + numf.format(taiKhoanNguoiChoi) );
                    }
                }else{
                    if(luaChonTaiXiu == 1){
                        System.out.println("*** Ban thang cuoc!");
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("*** Tai khoan cua ban la: " + numf.format(taiKhoanNguoiChoi) );
                    }else {
                        System.out.println("*** Ban thua cuoc!");
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("*** Tai khoan cua ban la: " + numf.format(taiKhoanNguoiChoi));
                    }
                }

            }
        }while (luaChon == 1);



    }
}
