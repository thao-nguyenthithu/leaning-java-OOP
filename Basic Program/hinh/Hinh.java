package hinh;
// import java.util.Scanner;

public class Hinh {
    private String name;

    public Hinh(String name){
        this.name = name ;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public void display(){
    
        System.out.print("Day la hinh: ");
    }

}
     