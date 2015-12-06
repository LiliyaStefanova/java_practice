package arrays;

import java.util.Scanner;

/**
 * Created by lstefa on 06/12/15.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Fractions {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int arr[] = new int[n];
            for(int arr_i=0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            int pos = 0;
            int neg = 0;
            int zero = 0;
            for(int i = 0; i< n; i++){
                if(arr[i]>0){
                    pos = pos + 1;
                }
                else if(arr[i]<0){
                    neg = neg +1;
                }
                else{ zero = zero + 1; }
            }
//            double frac_pos = pos/n;
//            double frac_neg = neg/n;
//            double frac_zero = zero/n;
            double pos_frac = pos/(double) n;
            double neg_frac = neg/(double) n;
            double zero_frac = zero/(double) n;
            System.out.println(pos_frac);
            System.out.println(neg_frac);
            System.out.println(zero_frac);
        }
    }
