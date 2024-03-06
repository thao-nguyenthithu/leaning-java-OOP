package toan1ngoi;

public class cacpheptoan {
    public static void main(String[] args) {
        int a = 5; 
        boolean b = true; 

        System.out.println("-a = " + (-a));
        System.out.println("+a = " + (+a));
        System.out.println("!b = " + (!b));

        System.out.println("------------");
        System.out.println("a = " + a);
        System.out.println("++a = " + (++a)); // tang a len(++) xong roi dong len out moi duoc thuc thi (a)
        System.out.println("a++ = " + (a++)); // out (a) duoc thuc thi xong, xong roi moi tang a len (++)
        System.out.println("a = " + a);
        System.out.println("--a = " + (--a)); // tuong tu, tru xong moi in ra
        System.out.println("a-- = " + (a--)); // in ra moi tru
        System.out.println("a = " + a);

        // -a = -5
        // +a = 5
        // !b = false
        // ------------
        // a = 5
        // ++a = 6
        // a++ = 6
        // a = 7
        // --a = 6
        // a-- = 6
        // a = 5
    }
}
