import java.util.ArrayList;
import java.util.Scanner;

public class RownanieKwadratowe {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (true) {
            Scanner input = new Scanner(System.in);
            String[] abc = input.nextLine().split(" ");
            try {
                double a = Double.parseDouble(abc[0]);
                double b = Double.parseDouble(abc[1]);
                double c = Double.parseDouble(abc[2]);
                if ((b * b - 4 * a * c) > 0) arrayList.add(2);
                else if ((b * b - 4 * a * c) == 0) arrayList.add(1);
                else arrayList.add(0);
            } catch (NumberFormatException nfe) {
                break;
            }
        }

        arrayList.forEach(System.out::println);
    }
}
