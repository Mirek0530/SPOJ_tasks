import java.util.ArrayList;
import java.util.Scanner;

public class ProsteDodawanie {
    public static void main(String[] args) {

        int t, sum, x;
        int r = 0;

        Scanner input = new Scanner(System.in);

        t = input.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();

        while (r < t) {
            Scanner input_2 = new Scanner(System.in);
            x = input_2.nextInt();
            input_2 = new Scanner(System.in);
            String[] string;
            string = input_2.nextLine().split(" ");

            sum = 0;

            for (int i = 0; i < x; i++) {
                sum += Integer.parseInt(string[i]);
            }

            arrayList.add(sum);
            r++;
        }

        System.out.println();

        arrayList.forEach(System.out::println);
    }
}
