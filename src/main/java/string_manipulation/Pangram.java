package string_manipulation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pangram {

    public static void main(String[] args) {
        String [] alphabet = new String [26];
        alphabet[0] = "a";
        alphabet[1] = "b";
        alphabet[2] = "c";
        alphabet[3] = "d";
        alphabet[4] = "e";
        alphabet[5] = "f";
        alphabet[6] = "g";
        alphabet[7] = "h";
        alphabet[8] = "i";
        alphabet[9] = "j";
        alphabet[10] = "k";
        alphabet[11] = "l";
        alphabet[12] = "m";
        alphabet[13] = "n";
        alphabet[14] = "o";
        alphabet[15] = "p";
        alphabet[16] = "q";
        alphabet[17] = "r";
        alphabet[18] = "s";
        alphabet[19] = "t";
        alphabet[20] = "u";
        alphabet[21] = "v";
        alphabet[22] = "w";
        alphabet[23] = "x";
        alphabet[24] = "y";
        alphabet[25] = "z";
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        Boolean pangram = false;
        if(sentence.length()>1 || sentence.length()<1000){
            String low_sentence = sentence.toLowerCase();
            for(int i=0; i<26; i++){
                if(low_sentence.contains(alphabet[i])){
                    pangram = true;
                }
                else{
                    pangram = false;
                    break;
                }
            }
        }
        if(pangram){
            System.out.println("pangram");
        }
        else{
            System.out.println("not pangram");
        }
    }
}