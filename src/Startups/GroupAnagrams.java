package Startups;

public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.println(code("mannnsi"));
    }

    //creating unique code for each word to compare
    public static String code(String word){
        StringBuffer br = new StringBuffer();//stringbuilder is faseter
        int[] freq = new int[26];
        //word = word.toLowerCase();
        for(char c : word.toCharArray()){
            freq[c-'a']++;
        }
        for(int i=0;i<freq.length;i++){
            int ele = freq[i];
            if(ele>0){
                char ch = (char) (i+'a');
                br.append(ch).append(ele);
            }
        }
        return br.toString();
    }

}
