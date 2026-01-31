package Structures;

public class Ques1 {
    public static void main(String[] args) {
        String sen = "ansf nfoisahf msderr dijfkd diie";
        System.out.println(countValidWords(sen));

    }
     public static int countValidWords(String sen){
        int count =0;
        String[] words = sen.split((" "));
        for(String word : words){
            if(word.length()>=3 && word.matches("[a-z0-9A-Z]+")){
                for(char c : word.toCharArray()){
                    int prev =0;
                    int prec =0;
                    if("aeiou".indexOf(c) != -1)  prev++;
                    else prec++;

                    if(prev>0 && prec>0) break;
                }
                count++;
            }
        }
        return count;
    }
}
