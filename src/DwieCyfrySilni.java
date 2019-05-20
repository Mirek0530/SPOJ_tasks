import java.util.ArrayList;
import java.util.Scanner;

public class DwieCyfrySilni {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int d = input.nextInt();
        int i = 0;

        ArrayList<Integer> arrayList = new ArrayList<>();

        while (i < d) {
            Scanner input_2 = new Scanner(System.in);

            arrayList.add(input_2.nextInt());
            i++;
        }

        System.out.println();

        for(int a: arrayList) {
            long x = silnia(a);
            System.out.println(((x % 100)/10) + " " + x % 10);
        }
    }

    public static long silnia(int number) {
        long x;
        if (number <= 1) {
            return 1;
        } else {
            x = number*silnia(number-1);
        }
        return x;
    }

}