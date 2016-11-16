import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by kt_ki on 9/29/2016.
 */
public class LeftRotation {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
//        int[] aa = new int[n + 1];
//        System.arraycopy(a, 0, aa, 0, n);
//        a = aa;

        System.out.println(a.length);
        if (k < n) {
            for (int i = 0; i < k; i++) {
                //System.out.print(".." + a[i]);
                int temp = a[0];
                for (int j = 1; j < n; j++) {
                    a[j - 1] = a[j];
                }
                a[n - 1] = temp;
            }
        }
        return a;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for (int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();

    }
}
