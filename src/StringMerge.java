import java.util.ArrayList;
import java.util.Scanner;

public class StringMerge {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Scanner inputString = new Scanner(System.in);
            String[] string = inputString.nextLine().split(" ");
            String merged = stringMerge(string[0], string[1]);
            list.add(merged);
        }

        list.forEach(System.out::println);

    }

    private static String stringMerge(String s1, String s2) {
        int a = s1.length();
        int b = s2.length();
        StringBuilder sb = new StringBuilder();
        if (a > b) {
            for (int i = 0; i < b; i ++) {
                sb.append(s1.charAt(i));
                sb.append(s2.charAt(i));
            }
        } else if (b > a) {
            for (int i = 0; i < a; i ++) {
                sb.append(s1.charAt(i));
                sb.append(s2.charAt(i));
            }
        } else {
            for (int i = 0; i < b; i ++) {
                sb.append(s1.charAt(i));
                sb.append(s2.charAt(i));
            }
        }
        return sb.toString();
    }
}
