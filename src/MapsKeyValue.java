import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by kt_ki on 9/6/2016.
 */
public class MapsKeyValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> namePhone = new HashMap<>();
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            namePhone.put(name, phone);
        }

        while (in.hasNext()) {
            String s = in.next();

                if(namePhone.containsKey(s)){
                    System.out.println(s + " = " + namePhone.get(s));
                }else
                {
                    System.out.println("Not found");
                }

        }
        in.close();
    }
}
