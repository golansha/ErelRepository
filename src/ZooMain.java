import java.util.ArrayList;
import java.util.List;

public class ZooMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.talk();
        List<Animal> zoo = new ArrayList<>();
        zoo.add(dog);
        zoo.add(new Cat());
        zoo.add(new Fish());
        for (Animal animal: zoo) {
            animal.printName();
            animal.talk();
        }
    }
}
