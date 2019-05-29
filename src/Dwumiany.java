import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Dwumiany {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = Integer.parseInt(input.nextLine());

        ArrayList<BigInteger> arrayList = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            String[] nk = input.nextLine().split(" ");
            BigInteger n = new BigInteger(String.valueOf(Integer.parseInt(nk[0])));
            BigInteger k = new BigInteger(String.valueOf(Integer.parseInt(nk[1])));
            BigInteger newton = new BigInteger(String.valueOf(factorial(n).divide(factorial(k).multiply(factorial(n.subtract(k))))));
            arrayList.add(newton);
        }

        System.out.println();

        arrayList.forEach(System.out::println);

    }

    private static BigInteger factorial(BigInteger number) {
        BigInteger result = new BigInteger(String.valueOf(1));
        if (number.intValue() < 2) return result;
        if (number.intValue() >= 2) result = number.multiply(factorial(BigInteger.valueOf((number.intValue() - 1))));
        return result;
    }
}
