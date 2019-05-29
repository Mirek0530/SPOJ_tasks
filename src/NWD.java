import java.util.ArrayList;
import java.util.Scanner;

public class NWD {
    public static void main(String[] args) {

        int t, r = 0;
        Scanner input = new Scanner(System.in);
        t = input.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();

        while (r < t) {
            String[] liczby;
            Scanner input_2 = new Scanner(System.in);
            liczby = input_2.nextLine().split(" ");

            arrayList.add(nwd(Integer.parseInt(liczby[0]), Integer.parseInt(liczby[1])));

            r++;
        }

        System.out.println();

        arrayList.forEach(System.out::println);
    }

    public static int nwd(int x, int y) {
        while (x != y) {
            if (x > y)
                x -= y;
            else
                y -= x;
        }
        return x;
    }
}
