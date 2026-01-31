package Startups;

import java.util.HashMap;

public class Ques1String {
    public static void main(String[] args) {
        String sample = "absdiu kusdgfiuef gjfbgur njkdhfed";
        System.out.println(validSubStrings(sample));
    }

   public static int validSubStrings(String sam){
        int count =0;
        sam=sam.trim();
        HashMap<Character,Integer> map = new HashMap<>();
        int[] freq = new int[26];
        freq[0]=1;
        freq[1]=1;
        return 0;
   }

}
