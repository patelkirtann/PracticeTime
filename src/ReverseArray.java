import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kt_ki on 9/4/2016.
 */
public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
         int k = n;
        for (int i = 0; i < n/2; i++ ) {
            int temp = arr[i];
            arr[i] = arr[k-1];
            arr[k-1] = temp;
            k--;
            //System.out.print(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i]+" ");
//        }
        in.close();
    }
}
