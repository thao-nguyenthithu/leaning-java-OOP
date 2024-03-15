package xulymang;

import java.util.Arrays;

public class Test2 {

        public static void main(String[] args) {
                xulymang.SinhVien sv1 = new xulymang.SinhVien(120,"Nguyen Van Bay", "lop 1", 9);
                xulymang.SinhVien sv2 = new xulymang.SinhVien(100,"Saitama", "lop 2", 8);
                xulymang.SinhVien sv3 = new xulymang.SinhVien(99,"Nathan Bae", "lop 2", 8);

                xulymang.SinhVien[] a_sv = new xulymang.SinhVien[]{sv1, sv2, sv3};
                System.out.println("a ban dau: " + Arrays.toString(a_sv));
                //Ham sap xep
                Arrays.sort(a_sv);
                System.out.println("a sau xap sep: " + Arrays.toString(a_sv));

                //Tim kiem
                System.out.println("Tim kiem vi tri Saitama " + Arrays.binarySearch(a_sv,sv2));

        }


    }