/**
 * Created by kt_ki on 9/2/2016.
 */

import java.time.*;

import java.util.Calendar;
import java.util.Scanner;

public class CalenderTask {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int date = in.nextInt();
        int year = in.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, date) ;
        int i=calendar.get(Calendar.DAY_OF_WEEK);

        System.out.println(i);

    }
}
