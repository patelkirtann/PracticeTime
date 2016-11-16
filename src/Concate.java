/**
 * Created by kt_ki on 8/29/2016.
 */
import java.util.Scanner;
import java.util.stream.Stream;

public class Concate {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        int i = 4;
        double d = 4.0;
        String s = "Hello Kirtan";

        int ii = sc.nextInt();
        double dd = sc.nextDouble();
        String ss = scan.nextLine();

        System.out.println(i + ii);
        System.out.println(d + dd);
        System.out.println(s + ss);

        //sc.close();

    }
}
