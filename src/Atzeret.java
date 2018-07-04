import java.math.BigInteger;

public class Atzeret {
    public static void main(String[] args){
        BigInteger result = factorial(new BigInteger("70"));
        System.out.println(result);
    }
    public static BigInteger factorial(BigInteger n){
        if (n.equals(new BigInteger("1"))){
            return new BigInteger("1");
        }
        return factorial(n.subtract(new BigInteger("1"))).multiply(n);
    }
}
