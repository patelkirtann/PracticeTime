
import java.util.Scanner;

/**
 * Created by kt_ki on 8/31/2016.
 */
public class HasNext {

    public static void main(String[] args) {
        //boolean flag = true;
        Scanner sc = new Scanner(System.in);
        int i =1;
       while (sc.hasNext()) {
            String s1 = sc.nextLine();
//            String s2 = sc.nextLine();
//            String s3 = sc.nextLine();

            System.out.println(i +" " + s1);
            i++;
//            System.out.println("2 " + s2);
//            System.out.println("3 " + s3);
        }
        sc.close();
    }
}
