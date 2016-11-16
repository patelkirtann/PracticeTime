import java.util.Scanner;

public class StringCompareNext {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    int n = sc.nextInt();

    String[] sArray = new String[s.length() - (n - 1)];
    int[] nArray = new int[s.length() - (n - 1)];

    private void setDividedString() {
        for (int i = 0; i < sArray.length; i++) {
            sArray[i] = s.substring(i, i + n);
            System.out.println(sArray[i]);
        }
    }

    private void setStringToNumber() {
        for (int i = 0; i < sArray.length; i++) {
            for (int j = 0; j < n - 1; j++) {
                nArray[i] = sArray[i].charAt(j) + sArray[i].charAt(j + 1);
            }
            System.out.println(nArray[i]);
        }
    }

    private void getMaxMin() {
        int max = 0, min = 0;
        for (int i = 0; i < nArray.length; i++) {
            if (sArray[i].charAt(0) > max) {
                max = nArray[i];
            }
            if (sArray[i].charAt(0) < max) {
                min = nArray[i];
            }

        }
        System.out.println(max + " " + min);
    }

    public static void main(String[] args) {
        StringCompareNext scn = new StringCompareNext();

        scn.setDividedString();
        scn.setStringToNumber();
        scn.getMaxMin();

    }
}
