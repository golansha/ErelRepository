import java.util.*;

public class ErelGame {
    private static Set<Integer> legalCubes = new HashSet<Integer>(Arrays.asList(4,6,8,10,12,20));
    private static Scanner scanner = new Scanner(System.in);
    public static void main (String []args){
        Stack<Cube> cubes = new Stack<>();
        String userChoice = "";
        while(!userChoice.equals("3")) {
            userChoice = getUserChoice();
            if (userChoice.equals("1")) {
                addCube(cubes);
            }
            if (userChoice.equals("2")) {
                removeCube(cubes);
            }
            if (userChoice.equals("")) {
                throwCubes(cubes);
            }
        }

    }
    public static String getUserChoice(){
        System.out.println("If you want to add a Cube press 1.\n" +
                "If you want to remove a cube press 2\n" +
                "If you want to throw the cube/s press Enter.\n" +
                "If you want to quit press 3");
        return scanner.nextLine();

    }
    public static void addCube(Stack<Cube> cubes){
        if (cubes.size() < 10) {
            System.out.println("Select cube (4, 6, 8, 10, 12, 20)");
            int userType = scanner.nextInt();
            scanner.nextLine();
            if (!legalCubes.contains(userType)){
                System.out.println("Error!\n" +
                        "Unexist cube!");
            }
            else {
                cubes.push(new Cube(userType));
            }
            System.out.println("You have " + cubes.size() + " cubes");
        }
        else {
            System.out.println("Error!\n" +
                    "Can't be over 10 cubes");
        }

    }
    public static void removeCube(Stack<Cube> cubes){
        if (!cubes.isEmpty()) {
            cubes.pop();
            System.out.println("You have " + cubes.size() + " cubes");
        }
        else {
            System.out.println("Error!\n" +
                    "Can't be under 0 cubes");
        }

    }
    public static void throwCubes(Stack<Cube> cubes) {
        int schum = 0;
        for (Cube cube : cubes) {
            int result = cube.throwCube();
            schum = result + schum;
            System.out.print(result+" ");
        }
        System.out.println(schum);

    }
}
