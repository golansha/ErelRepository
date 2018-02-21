import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static void main (String []args){
        int numCubes = 0;
        int typeCube = 0;
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        String userChoice = "";
        while(!userChoice.equals("3")) {
            if (numCubes == 0) {
                System.out.println("Select cube (4, 6, 8, 10, 12, 20)");
                int userType = scanner.nextInt();
                scanner.nextLine();
                if (userType != 4
                        &&userType != 6
                        &&userType != 8
                        &&userType != 10
                        &&userType != 12
                        &&userType != 20){
                    System.out.println("Error!\n" +
                            "Unexist cube!");
                }
                else {
                    typeCube = userType;
                }
            }
            System.out.println("If you want to add Cube press 1.\n" +
                    "If you want to remove cube press 2\n" +
                    "If you want to dice the cube/s press Enter.\n" +
                    "If you want to quit press 3");
            userChoice = scanner.nextLine();
            if (userChoice.equals("1")) {
                if (numCubes < 10) {
                    numCubes = numCubes + 1;
                    System.out.println("You have " + numCubes + " cubes");
                }
                else {
                    System.out.println("Error!\n" +
                            "Can't be over 10 cubes");
                }
            }
            if (userChoice.equals("2")) {
                if (numCubes > 0) {
                    numCubes = numCubes - 1;
                    System.out.println("You have " + numCubes + " cubes");
                }
                else {
                    System.out.println("Error!\n" +
                            "Can't be under 0 cubes");
                }
            }
            if (userChoice.equals("")) {
                int schum = 0;
                for (int i = 0; i < numCubes; i++) {
                    int result = rand.nextInt(typeCube) + 1;
                    schum = result + schum;
                    System.out.println(result);
                }
                System.out.println(schum);
            }
        }

    }
}
