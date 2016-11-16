import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by kt_ki on 10/28/2016.
 */
public class GoDaddyChallange {

    static LinkedList<Integer> linkedList = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);
    static int n, x;

    static void setLinkedList() {

        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            linkedList.add(sc.nextInt());
        }
        x = sc.nextInt();
        getLinkedList();
    }

    static void getLinkedList() {

        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) > x) {
                linkedList.remove();
            } else {
                System.out.println(linkedList.get(i));
            }
        }
    }


    public static void main(String[] args) {

        setLinkedList();
    }
}
