
import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reminder = 0;

        Stack sk = new Stack();
        Stack sk1 = new Stack();

        while (n > 0) {
            reminder = n % 2;
            n = n / 2;
            sk.push(reminder);
        }

        System.out.println(sk.toString());
//        System.out.println(sk.size());
        int ans = 0;
        // ans = (int) sk.elementAt(2) + (int) sk.elementAt(3);

        //int counter = 0;
        for (int i = 0; i < sk.size()-1; i++) {
            for (int j = 1; j < sk.size()-1; j++) {
                if (sk.elementAt(i) != sk.elementAt(j)) {
                    ans = 0;
                }
                if (sk.elementAt(i) == sk.elementAt(j)) {
                    //int sum = 1;
                    int sum = (int)sk.elementAt(i) + (int)sk.elementAt(j);
                    ans = ans + sum;
                }
            }
        }
        if (ans == 0) {
            ans = 1;
        }
        System.out.println(ans);
//        System.out.println(sk.toString());
    }
}
