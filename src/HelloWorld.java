import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.pow;

public class HelloWorld {
    public static void main (String[] args) {
        Car car1 = new Car("yellow", 100, "Erel");
        Car car2 = new Car("red", 80, "Shahar");
        System.out.println("the car of " +car1.driver+ " has color " + car1.color);
        car1.drive(3);
        car2.drive(2);
        car1.drive(5);
        System.out.println("the car of " +car1.driver+ " has moved " + car1.distance+" km");
        System.out.println("the car of " +car2.driver+ " has moved " + car2.distance+" km");
        Random rand = new Random();
        int number = rand.nextInt(6);
    }
    public static void calculator(){
        boolean anotherRound = true;
        while (anotherRound) {
            System.out.println("Enter your pe'ula ");
            Scanner scanner = new Scanner(System.in);
            String peula = scanner.nextLine();
            System.out.println("Enter your first number: ");
            int firstNumber = scanner.nextInt();
            System.out.println("Enter your second number: ");
            int secondNumber = scanner.nextInt();
            System.out.println(firstNumber + peula + secondNumber);
            System.out.println(calcOperation(firstNumber,secondNumber,peula));
            System.out.println("another round?");
            anotherRound = scanner.nextBoolean();
        }

    }

    public static int calcOperation(int first, int second, String operation){
        switch(operation) {
            case "+":
                return first + second;
            case "-":
                return first - second;
            case "*":
                return first * second;
            case "/":
                return first / second;
            default:
                throw new RuntimeException("wrong pe'ula");
        }

    }
//        System.out.println("Enter your username: ");
//        Scanner scanner = new Scanner(System.in);
//        String username = scanner.nextLine();
//        System.out.println("Your username is " + username);
//        int x = 3 * (int)pow(10, 9);
//        System.out.println(x);
//        boolean b = true;
//        float y = 0.1f;
//        double z = 0.2;
//
//        boolean b2 = false;
//        b = b && b2;
//        b = b || b2;
//        for (int i = 0; i<10; i++) {
//            System.out.println("hello "+i);
//        }
//        int maximalNumber = 10000;
//        int sum = 0;
//        for (int i = 0; i<=maximalNumber; i++) {
//            sum = sum + i;
//        }
//        System.out.println(sum)
}
