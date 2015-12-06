package string_manipulation;

/**
 * Created by lstefa on 06/12/15.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class TimeConversion {


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String time = in.next();
            String mil_conv = "";
            String hours = time.substring(0, 2);
            if (time.contains("PM")) {
                if(hours.equals("12")){
                    System.out.println(time.substring(0, time.length() - 2));
                }
                int conv_val = Integer.parseInt(hours) + 12;
                System.out.println(conv_val);
                mil_conv = Integer.toString(conv_val);
                System.out.println(mil_conv + time.substring(2, time.length() - 2));
            }
            else if(time.contains("AM") || time.contains("am")){
                if (hours.equals("12")) {
                    mil_conv = "00";
                    System.out.println(mil_conv + time.substring(2, time.length() - 2));
                }
                else {
                    System.out.println(time.substring(0, time.length() - 2));
                }
            }
        }
    }
