package Startups;

public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.println(code("Mannnsi"));
    }

    //creating unique code for each word to compare
    public static String code(String word){
        StringBuffer br = new StringBuffer();
        int[] freq = new int[26];
        for(char c : word.toCharArray()){
            freq[c-'a']++;
        }
        for(int ele : freq){
            if(ele>0){

            }
        }
    }

}
