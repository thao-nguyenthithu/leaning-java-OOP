import java.util.List; 
import java.util.Random;
import java.util.ArrayList;

public class RandomNumbers {
    private List<Integer> numbers;

    public RandomNumbers() {
        numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            numbers.add(random.nextInt());
        }
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

}
