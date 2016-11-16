import sun.misc.ASCIICaseInsensitiveComparator;

import java.util.Scanner;

/**
 * Created by kt_ki on 9/7/2016.
 */
public class StringCapsValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(A.length() + B.length());
        if(A.charAt(0) > B.charAt(0)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        //String s = String.valueOf(A.charAt(0));

        System.out.println(A.replace(A.charAt(0),A.toUpperCase().charAt(0)) + " " + B.replace(B.charAt(0),B.toUpperCase().charAt(0)));

    }
}
