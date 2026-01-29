package Structures;

import java.io.Console;
import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) throws Exception {
        Console console = System.console();
        if(console ==null){
            System.out.println("conslole nahi hai ");
        }
        String uname = console.readLine("Enter name");
        char[] pass = console.readLine("Enter password").toCharArray();
        console.printf("welcome %s %n",uname);
        Arrays.fill(pass,' ');
    }
}
