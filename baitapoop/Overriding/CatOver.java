public class CatOver extends OverAnimal{

    public CatOver() {
        super("Cat");
    }

    @Override
    public void eatOver() {
        System.out.println("An ca");
    }

    @Override
    public void makeSound() {
        System.out.println("meow meow");
    }
  
}
