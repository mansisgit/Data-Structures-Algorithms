package Structures;

public class Ques1 {
    public static void main(String[] args) {
       // String sen = "ansf nfoisahf msderr dijfkd diie";
        //System.out.println(countValidWords(sen));
        int[] arr ={28078,19451,935,28892,2242,3570,5480,231};
        System.out.println("ans");
        System.out.println(getSecondLargest(arr));
        System.out.println(getSecondSmallest(arr));

    }
    public static int getSecondSmallest(int[] arr){
        int min=Integer.MAX_VALUE;
        int secmin = Integer.MAX_VALUE;
        for(int ele:arr){
            if(ele<min){
                secmin=min;
                min=ele;
            } else if(ele>min && ele<secmin) secmin=ele;
        }
        return secmin==Integer.MAX_VALUE ? -1 : secmin;
    }


    public static int getSecondLargest(int[] arr) {
        // code here
        int max =Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for(int ele : arr){
            if(ele>max){
                secMax=max;
                max=ele;
            } else if(ele<max && ele>secMax)
                secMax=ele;

        }


        return secMax;
    }
     public static int countValidWords(String sen){
        int count =0;
        String[] words = sen.split((" "));
        for(String word : words){
            if(word.length()>=3 && word.matches("[a-z0-9A-Z]+")){
                for(char c : word.toCharArray()){
                    int prev =0;
                    int prec =0;
                    if("aeiouAEIOU".indexOf(c) != -1)  prev++;
                    else prec++;

                    if(prev>0 && prec>0) break;
                }
                count++;
            }
        }
        return count;
    }
}
