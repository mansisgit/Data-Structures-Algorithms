import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        //list.remove(1);
        System.out.println(list.remove(1)+"removed by index");
        System.out.println(list.remove(Integer.valueOf(10))+"by value/object");
        System.out.println(Arrays.toString(list.toArray()));

        //printing right angled triangle
        for(int i=0;i<3;i++){
            int j=i+1;
            while (i+j-->0){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println('\u092E');
        Scanner sc = new Scanner(System.in);
        String enter = sc.next();
        //String con =

        System.out.println(enter.charAt(0)+enter);
        //StringBuffer br = new StringBuffer(entered).reverse();
        StringBuffer entered = new StringBuffer(sc.next());
        int left =0;
        int right = entered.length()-1;


        while(left<right){
            char r = entered.charAt(right),l = entered.charAt(left);
            char temp=l;
            l=r;
            r=temp;
            left++;
            right--;
        }
        System.out.println(entered.toString());
       // System.out.println(br.toString());
        String check = sc.next();
        int []freq = new int[26];
        for(char c : entered.toString().toCharArray()){
            freq[c-'a']++;
        }
        for(char c : check.toCharArray()){
            if(freq[c-'a']!=0) {
                freq[c - 'a']--;
                if(c==check.charAt(check.length()-1) && freq[c-'a']==0) System.out.println("yes both are anagram");
            }
            else System.out.println("not an anagram");
        }
    //lambda function


    }
}
sealed class Animal permits Tiger,Lion {

}
final class Tiger extends Animal{}
final class Lion extends Animal {}



