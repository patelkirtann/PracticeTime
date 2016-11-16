import java.util.*;

public class StringCompare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < number; i++) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            String ans = " ";
            outerloop:
            for (int k = 0; k < s1.length(); k++) {
                for (int l = 0; l < s2.length(); l++) {
                    if (s1.charAt(k) == s2.charAt(l)) {
                        ans = "Yes";
                        break outerloop ;
                    } else {
                        ans = "No";
                    }
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
