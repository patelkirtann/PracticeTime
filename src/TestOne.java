import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by kt_ki on 9/26/2016.
 */
public class TestOne {

    static int maxLength(int[] a , int k){
//        int[] _a = a;
//        int kk = k;


        int count = 0;
        for(int i = 0 ; i< a.length ; i++){


            //System.out.println(a[i]);
            if(a[i] <= k){
                count ++ ;
            }
        }
        //System.out.println(_a.length);
        return count - 1;
    }

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        //final String fileName = System.getenv("OUTPUT_PATH");
       // BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int res;

        int _a_size ;
        _a_size = Integer.parseInt(in.nextLine().trim());
        int[] _a = new int[_a_size];
        int _a_item;
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(in.nextLine().trim());
            _a[_a_i] = _a_item;
        }

        int _k;
        _k = Integer.parseInt(in.nextLine().trim());

        System.out.println(maxLength(_a, _k));
//        bw.write(String.valueOf(res));
//        bw.newLine();
//
//        bw.close();
    }
}

