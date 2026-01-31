import java.io.*;
import java.util.Scanner;

//public class StudRecord {
//    String name;
//    int roll_No;
//    StudRecord(){}
//    StudRecord(String name ,int roll_No){
//        super();
//        this.name = name;
//        this.roll_No = roll_No;
//    }
//    public void addrecord(String name,int roll_No){
//        try(ObjectInputStream ip = new ObjectInputStream(new FileInputStream("c:\\dyp\\input.txt"))){


//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


//        public static void main(String[] args) {
//        Console console = System.console();
//        if(console ==null){
//            System.out.println("conslole nahi hai ");
//        }
//
//
//        StudRecord obj = new StudRecord("mansi",40);
//        File f = new File("c:\\dyp\\input.txt");
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your choice");
//        int choice = sc.nextInt();
//        switch (choice){
//            case 1-> obj.addrecord("tanvi",67);
//            case 2->obj.updaterecord(45);
//            case 3 ->obj.deleterecord(34);
//            case 4 -> obj.viewAll();
//            case 5 -> obj.exit();
//        }
//    }
//}
