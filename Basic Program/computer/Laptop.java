import java.util.Scanner;

public class Laptop extends Computer 
{
    private String pinLaptop;
    private String osLaptop;

    // Thêm constructor mặc định (không có tham số)
    public Laptop(){
        super("", 0); // Gọi constructor của lớp cha với giá trị mặc định
    }

    public Laptop(String chip, int ram, String pinLaptop, String osLaptop){
        super(chip, ram);
        this.pinLaptop = pinLaptop; 
        this.osLaptop = osLaptop;
    }
    //Override
    public void input(){

        // goi method input tu cha
        super.input();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pin: ");
        this.pinLaptop = scanner.nextLine();
        System.out.print("OS: ");
        this.osLaptop = scanner.nextLine();

    }

    public void output(){
        super.output();

        System.out.println("Pin: " + pinLaptop);
        System.out.println("OS: " + osLaptop);
    }

    public static void main(String[] args) {
        Laptop myLaptop = new Laptop();

        myLaptop.input();
        myLaptop.output();
    }
} 
