package Startups;

import java.util.Arrays;
import java.util.List;

public class ListTask {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
        List<String> names = Arrays.asList("Sekhar", "Amit", "Anita", "Ravi", "Suman", "Ajay");

        int count=0;
        int sum=0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        //even & odd
        for(int ele : numbers){
            if(ele%2==0) System.out.println("even-->"+ele);
            else System.out.println("odd-->"+ele);

            System.out.println("multiplication by 2: "+ele*2);
            if(ele>25) System.out.println("greater then 25 "+ele);
            count++;
            sum+=ele;
            min=Math.min(min,ele);
            max=Math.max(max,ele);
        }
        System.out.println("total elements: "+count);
        System.out.println("sum of all: "+sum);
        System.out.println("Maximum is:"+max+"& Minimum is"+min);

        for(String name : names){
            if(name.charAt(0)=='A') System.out.println("name is starting with A--->"+ name);
            if(name.charAt(name.length()-1)=='i') System.out.println("name ending with i"+ name);
            System.out.println("converting to uppercase: "+ name.toUpperCase());

            char[] arr = name.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            System.out.println();
        }

    }
}
    