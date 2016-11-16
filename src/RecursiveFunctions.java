import com.sun.deploy.util.SyncAccess;

import java.util.Scanner;

/**
 * Created by kt_ki on 9/7/2016.
 */
public class RecursiveFunctions {

    //Summation
    //f(f(f(i))) ..... i=3
    //f(i) = 5 + i == f(3) = 8
    public static int summation(int i){
        if(i <=0 ){
            return 0;
        }else {
            return i + summation(i-1);
        }
    }

    //Factorial
    //3! = 3 *2*1
    public static int factorial(int i){
        if(i <= 1){
            return 1;
        }else {
            return i * factorial(i-1);
        }
    }

    //Exponential
    //3^2 = 3*3*1
    public static int exponential(int x, int y){
        if(y <= 0){
            return 1;
        }else
        {
            return x * exponential(x , y-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int x1= sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println(summation(number));
        System.out.println(factorial(number));
        System.out.println(exponential(x1,y1));
    }
}
