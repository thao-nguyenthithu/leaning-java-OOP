package hinh;

public class HinhTron extends Hinh {
    //private String hinhTron; 
    private double r; 

    public HinhTron(){
        super("Hinh Tron");
    }

    public double dtHinhTron(){
        return 3.14*r*r;
    }

    // Overriding
    public void display(){
        
        System.out.println("Day la Hinh Tron");
    }

}
