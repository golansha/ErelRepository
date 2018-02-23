public class Dog extends Animal{
    public Dog(){
        super();
        name = "Dog";
    }

    @Override
    public void talk() {
        System.out.println("Woof!");
    }
}
