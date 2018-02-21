public class Car {
    public String color;
    public int speed;
    public String driver;
    public int distance;
    public Car(String c, int s, String d){
        color = c;
        speed = s;
        driver = d;
        distance =0;
    }
    public void drive(int time){
        System.out.println(driver + " driving " + time + " hours");
        distance = distance + (speed * time);
    }

}
