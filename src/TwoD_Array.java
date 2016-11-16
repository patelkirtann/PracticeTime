import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kt_ki on 9/21/2016.
 */
public class TwoD_Array {

    Scanner sc = new Scanner(System.in);
//    int row = sc.nextInt();
//    int col = sc.nextInt();

    int[][] array = new int[6][6];

    public void setValues() {
        for (int i = 0; i < 6; i++) {
            again:
            for (int j = 0; j < 6; j++) {

                int temp = sc.nextInt();

                if (-9 <= temp && temp <= 9) {
                    array[i][j] = temp;
                } else {
                    System.out.println("Value should be in range of -9 & 9. Write the value again");
                    break again;
                }
            }
            System.out.println();
        }
        System.out.println();
        getValue();
    }

    public void getValue() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {

                System.out.print(" " + array[i][j]);

            }
            System.out.println();
        }
        getSum();
    }

    int sum[] = new int[16];
    int count = 0;

    public void getSum() {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                sum[count] = array[i][j] + array[i][j + 1] + array[i][j + 2] +
                        array[i + 1][j + 1] +
                        array[i + 2][j] + array[i + 2][j + 1] + array[i + 2][j + 2];

                count++;

            }
        }
        Arrays.sort(sum);
        System.out.println(sum[15]);
    }


    public static void main(String[] args) {
        TwoD_Array ta = new TwoD_Array();

        ta.setValues();

    }
}
