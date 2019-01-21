/**
 * JavaDates
 */
import java.util.*;
import java.text.*;
public class JavaDates {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
        System.out.println(dateFormat.format(date));
    }
}