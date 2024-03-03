import java.util.Scanner;

public class Computer {
   protected String chip; 
   protected Integer ram;

   public Computer(String chip, int ram){
      this.chip = chip; 
      this.ram = ram; 
   }
   public void input(){
    Scanner inputComputer = new Scanner(System.in);

    System.out.print("Chip: ");
    this.chip = inputComputer.nextLine();
    System.out.print("Ram: ");
    this.ram = inputComputer.nextInt();
   }

   public void output(){
      System.out.println("-------------------------");
      System.out.println("Chip: " + chip);
      System.out.println("Ram: " + ram);
   }

}
