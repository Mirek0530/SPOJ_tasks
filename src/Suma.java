import java.util.ArrayList;
import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {

        int sum = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (true) {
            Scanner input = new Scanner(System.in);
            try {
                sum += Integer.parseInt(input.nextLine());
                arrayList.add(sum);
            } catch (NumberFormatException nfe) {break;}
        }

        arrayList.forEach(System.out::println);
    }
}
