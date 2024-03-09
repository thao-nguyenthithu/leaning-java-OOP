public class OverAnimal {
    protected String nameOver;

    public OverAnimal(String nameOver) {
        this.nameOver = nameOver;
    }

    public String getNameOver() {
        return nameOver;
    }

    public void setNameOver(String nameOver) {
        this.nameOver = nameOver;
    } 

    public void eatOver(){
        System.out.println("Toi dang an ... ");
    }

    public void makeSound(){
        System.out.println(".....");
    }

    public void sleep(){
        System.out.println("Zzzz");
    }

}
