import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;
import java.io.*;

class Series {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter total Quarry");
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.println("\n Enter Value a");
            int a = in.nextInt();
            System.out.println("Enter Value b");
            int b = in.nextInt();
            System.out.println("Enter Value n");
            int n = in.nextInt();
            int temp = 0;

            for (int j = 0; j < n; j++) {
                double s = a + (Math.pow(2,j) * b )+ temp;
                System.out.print(" " + ((int) s));
                temp = ((int) s);
                a=0;
            }
        }
        in.close();
    }
}