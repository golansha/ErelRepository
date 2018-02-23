public class Fish extends Animal{
    public Fish(){
        name = "Fish";
    }

    @Override
    public void talk() {
        System.out.println("Can't talk");
    }
}
