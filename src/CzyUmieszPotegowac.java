import java.util.ArrayList;
import java.util.Scanner;

public class CzyUmieszPotegowac {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int d = input.nextInt();
        int i = 0;

        ArrayList<Integer> list = new ArrayList<>();

        while (i < d) {
            Scanner input2 = new Scanner(System.in);
            String[] sb = input2.nextLine().split(" ");

            list.add((int) Math.pow(Integer.parseInt(sb[0]), Integer.parseInt(sb[1])));
            i++;
        }

        System.out.println();
        for (Integer j: list) {
            System.out.println(j % 10);
        }
    }
}
