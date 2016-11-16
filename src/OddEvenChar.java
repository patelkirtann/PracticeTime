import java.util.Scanner;

/**
 * Created by kt_ki on 9/3/2016.
 */
public class OddEvenChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.println("How many input you wanna give?");
        int input = sc.nextInt();

        for (int i = 0; i < input; i++) {
            //System.out.println("Enter input :");
            String s = sc.next();
            char[] c = s.toCharArray();
            char[] ansEven = new char[s.length()];
            char[] ansOdd = new char[s.length()];
            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 0) {
                    ansEven[j] = c[j];
                } else {
                    ansOdd[j] = c[j];
                }
            }
            for (int j = 0; j < ansEven.length; j++) {
                System.out.print(ansEven[j]);
            }
            System.out.print(" ");
            for (int j = 0; j < ansOdd.length; j++) {
                System.out.print(ansOdd[j]);
            }
            System.out.println();
        }
    }
}
