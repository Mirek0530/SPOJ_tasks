import java.util.Scanner;

public class Tablice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        String[] strings = new String[n+1];

        for (int i = 0; i <= n; i++) {
            strings[i] = input.nextLine();
        }

        for (int j = 0; j < strings.length; j++) {
            String[] s = strings[j].split(" ");
            for (int k = (s.length-1); k>0; k--) {
                System.out.print(s[k] + " ");
            }
            System.out.print("\n");
        }
    }
}
