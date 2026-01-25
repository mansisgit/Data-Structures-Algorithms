package Structures;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class BasicStructures {
    public static void main(String[] args) {
        //knowing these at first imp---->

        //array    //hashmap
        //HashSet  //stack

        /*
        1.create memory
        2.iterate
        3.check condition-----Y
        4.update memory       |
        5. return result <----|
        * */

        System.out.println(code("cattcc"));

    }
    public static String code(String word){
        //e1a1t1
        TreeMap<Character,Integer> map = new TreeMap<>();
        for(char c : word.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        StringBuffer res = new StringBuffer();
        for(Map.Entry<Character,Integer> ent : map.entrySet()){
            res.append(ent.getKey()).append(ent.getValue());
        }
        return res.toString();
    }
}
