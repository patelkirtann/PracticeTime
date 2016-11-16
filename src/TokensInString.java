import java.util.Scanner;
import java.util.StringTokenizer;

import jdk.nashorn.internal.parser.Token;

/**
 * Created by kt_ki on 9/16/2016.
 */
public class TokensInString {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String delims = "[ !,?._'@]+";
    StringTokenizer st = new StringTokenizer(s, delims);
    int cout = 1;
    int i = 0;
    String[] sArray = new String[st.countTokens()] ;

    public void removeToken() {
        while (st.hasMoreTokens()) {
           // st.nextToken();
             sArray[i] = st.nextToken();
            i++;
            cout++;
        }
        System.out.println(cout-1);
        for (int i = 0; i < sArray.length ; i++) {
            System.out.println(sArray[i]);
        }

    }

    public static void main(String[] args) {
        TokensInString ts = new TokensInString();

        ts.removeToken();
    }
}
