package Startups;

import java.io.*;

public class Employee implements Serializable {

    int id;
    String name;
    float salary;
    transient String password;

    public Employee(){}
    public Employee(int id,String name, float salary, String password){
        super();
        this.id=id;
        this.name= name;
        this.salary=salary;
        this.password=password;

    }
    public void display(){
        System.out.println(id+" "+name+" "+salary+" "+password);
    }



    public static void main(String[] args) {
    Employee e1 = new Employee(101,"sumit",10000,"password");
//    try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("c:\\dyp\\input.txt"))){
//        out.writeObject(e1);
//        System.out.println("data written in the file");
//    } catch (FileNotFoundException e) {
//        e.printStackTrace();
//    } catch (IOException e) {
//        e.printStackTrace();
//    }

        File f = new File("c:\\dyp\\input.txt");
        System.out.println("Absolute Path"+ f.getAbsolutePath());
        System.out.println("free space"+ f.getFreeSpace());


        try(ObjectInputStream ip = new ObjectInputStream(new FileInputStream("c:\\dyp\\input.txt"))){
            Employee e = (Employee) ip.readObject();
            e.display();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
//        e.printStackTrace();
  } catch (ClassNotFoundException e){
            e.printStackTrace();
        }



    }
}
