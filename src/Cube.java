import java.util.Random;
import java.util.Scanner;

public class Cube {
    private int numFaces;
    private static Random rand = new Random();
    public Cube(int numFaces){
        this.numFaces = numFaces;
    }
    public int throwCube(){
        return rand.nextInt(numFaces) + 1;
    }
}
