
import java.util.*;


public class time {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String time = scan.next();
        String[] arr = time.split(":");
        int hh = Integer.parseInt(arr[0]);
        int mm = Integer.parseInt(arr[1]);
        int ss = Integer.parseInt(arr[2].substring(0, 2));
        String AmPm = arr[2].substring(2, 4);
        if(AmPm.equals("PM")&&hh<12)
            hh+=12;
        else if(AmPm.equals("AM")&&hh==12)
            hh=0;
        System.out.printf("%02d:%02d:%02d",hh,mm,ss);
    }
}