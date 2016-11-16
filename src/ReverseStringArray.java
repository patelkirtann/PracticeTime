import java.util.Scanner;

/**
 * Created by kt_ki on 9/15/2016.
 */
public class ReverseStringArray {

    static Scanner sc = new Scanner(System.in);

    static String s = sc.next();
    static String reverse = new StringBuffer(s).reverse().toString();

//    static char c ;
//    static String[] sArray = new String[s.length()];

    static void stringReverse(){
//        for (int i = 0; i < s.length(); i++) {
//             c = s.charAt(i);
//            sArray[i] = String.valueOf(c);
//            //System.out.println(sArray[i]);
//            //System.out.println(s.length());
//        }
        //System.out.println(s.equals(reverse));
        if(s.equals(reverse)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

    public static void main(String[] args) {
        stringReverse();
    }
}
