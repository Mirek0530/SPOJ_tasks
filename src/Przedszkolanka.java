import java.util.ArrayList;
import java.util.Scanner;

public class Przedszkolanka {
    public static void main(String[] args) {

        int n;
        int l = 0;

        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();

        while (l < n) {
            Scanner input2 = new Scanner(System.in);
            String[] sb = input2.nextLine().split(" ");

            arrayList.add(nww(Integer.parseInt(sb[0]), Integer.parseInt(sb[1])));
            l++;
        }

        System.out.println();

        for(int i : arrayList) {
            System.out.println(i);
        }
    }

    public static int nww(int x, int y) {
        return (x*y)/nwd(x,y);
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