public class Cat extends Animal {
    public Cat(){
        super();
        name = "Cat";
    }

    @Override
    public void talk() {
        System.out.println("Meow");
    }
}
