import java.util.ArrayList;

public class LiczbyPierwsze {
    public static void main(String[] args) {
        String result;

        System.out.println("Input: ");

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 100000; i++) {
            list.add(i);
            System.out.println(i);
        }

        System.out.println("\nOutput: ");

        for (int i : list) {
            result = isPrime(i);
            System.out.println(result);
        }
    }

    public static String isPrime(int n) {
        for (int i = 2; i < n; i++) if (n % i == 0) return "NIE";
        return "TAK";
    }
}
