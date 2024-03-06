package caulenhrenhanh;
/*
 * break cung voi label
 * label dung de chi dinh cho cho cac lenh break va continue
 * Cau truc 1 label <nameLabel:>
 * 
 */
public class lenhBreak {
    public static void main(String[] args) {
        int out,in = 0; 
        abc: for (out = 0 ; out < 10; out++){
            for (in = 0; in < 20 ; in++){
                if(in > 10)
                    break abc;  // khi in = 11 thi no se break cai abc. abc la vong ben ngoai
            }
            System.out.println("out cua for = " + out);
            System.out.println("in cua for = " + in);
        }
        System.out.println("out ngoai for = " + out);
        System.out.println("in ngoai for = " + in);
    }
}
