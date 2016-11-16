import java.util.Scanner;

/**
 * Created by kt_ki on 9/30/2016.
 */
public class ChocolateInJar {


    public static void setValue(int[] totalJar, int[] totalPlayer) {
        Scanner sc = new Scanner(System.in);

        int[] player = totalPlayer;

        for (int i : totalJar) {
            System.out.print(i + " ");
        }
        System.out.println("Enter Player number:");

         switch (sc.nextInt()) {
             case 1:
         }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Players");
        int[] totalPlayer = new int[sc.nextInt()];
        System.out.println("Enter Number of Jar");
        int[] totalJar = new int[sc.nextInt()];

        for (int i = 1; i <= totalJar.length; i++) {
            System.out.println("Enter total chocolate in Jar" + i);
            totalJar[i - 1] = sc.nextInt();
        }

        setValue(totalJar,totalPlayer);


    }
}
