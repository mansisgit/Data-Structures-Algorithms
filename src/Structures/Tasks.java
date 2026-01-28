package Structures;


//task1
/*
* read atext file and display its content
* count number of lines,words,and ccharacters in afile.
* Read a file and display only lines containing a given word.
* Read numbers from a file and find their sum and average.
* Read a file and print its content in reverse order.
*
* */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;
//task2
/*
* write a user input data inot a file
* Append text to an existig file
* Write even and odd numbers into separate files
* write student records into a file using BufferedWriter
* copy content from one file to another
*
* */
public class Tasks {
    public static void main(String[] args) throws Exception {
       //read text file and display its content
        BufferedReader br = new BufferedReader(new FileReader("employee.txt"));
        String line, word = "java";
        int lines = 0, words = 0, chars = 0;
        int sum =0,count=0;


        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        while ((line = br.readLine()) != null) {
            lines++;
            chars += line.length();
            words += line.split("\\s+").length;
        }

        System.out.println("Lines: " + lines);
        System.out.println("Words: " + words);
        System.out.println("Characters: " + chars);

        while ((line = br.readLine()) != null) {
            if (line.contains(word)) {
                System.out.println(line);
            }
        }

        while((line = br.readLine()) != null){
            int num = Integer.parseInt(line);
            sum+=num;
            count++;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (sum / (double) count));


        List<String> liness = Files.readAllLines(Paths.get("input.txt"));
        Collections.reverse(liness);

        for (String line1 : liness) {
            System.out.println(line1);
        }

        br.close();



    }
}
