package newproject;
import java.util.*;
import java.text.*;
/**
 * Daehee
 */
public class Daehee {

    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd",Locale.KOREA);
        Date currTime = new Date();
        String dtime = formatter.format(currTime);
        System.out.println("date : "+dtime);
    }
}