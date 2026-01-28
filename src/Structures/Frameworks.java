package Structures;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;



public class Frameworks {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("C:\\Users\\mansi tukaram chate\\OneDrive\\Pictures\\Screenshots\\input.png");
        FileOutputStream fos =  new FileOutputStream("C:\\Users\\mansi tukaram chate\\Downloads\\destination.jpg");
        int data;
        while((data = fis.read()) !=-1){
            fos.write(data);
        }
        System.out.println("successful");



        Employee obj = new Employee("mansi",100000,21,"it");
        Employee obj2 = new Employee("krisha",20000,34,"it");

        //1
        HashSet<Employee> set = new HashSet<>();
        set.add(obj);
        set.add(obj2);



        //3
        HashMap<String,String> map = new HashMap<>();
        map.put(obj.Department,obj.name);
        map.put(obj2.Department,obj2.name);
        System.out.println("Depatments:"+map.keySet());
        for(String name : map.keySet()){
            System.out.println(name+map.get(name));
        }
        //4
        //System.out.println(avgSalary());

        //2
      //  Iterator<Employee> ir = map.entrySet().iterator();
    }


}

class Employee{
    String name;
    int salary;
    int age;
    String Department;

    Employee(String name,int salary,int age,String Department){
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.Department=Department;
    }


}
