import java.util.Scanner;

/**
 * Created by kt_ki on 9/7/2016.
 */
public class FectorialNumber {

    public static int Factorial(int n){
        if(n <= 1){
            return 1;
        }else{
            return n * Factorial(n-1);
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        System.out.println(Factorial(number));
    }
}
