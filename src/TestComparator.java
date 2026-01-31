import java.util.Arrays;
import java.util.Comparator;
//Ques2
class Student{
    String name;
    int rollNo;
    double percentage;
    Student(String name,int rollNo,double percentage){
        this.name=name;
        this.rollNo=rollNo;
        this.percentage = percentage;
    }

    public String toString(){
        return name + "("+ rollNo+","+ percentage + ")";

    }
}

//create seperate class for comparator interface
//and overrides the compare() method

class RollNoComparator implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return  s1.rollNo-s2.rollNo;
    }

}

public class TestComparator{
    public static void main(String[] args) {
        Student[] students = {
                new Student("smit",20,45),
                new Student("mansi",23,56),
                new Student("oooo",89,100)
        };
        Arrays.sort(students ,new RollNoComparator());
        System.out.println(Arrays.toString(students));

        Arrays.sort(students,(s1,s2)->s1.name.compareTo(s2.name));
        System.out.println(Arrays.toString(students));

        Arrays.sort(students,Comparator.comparingInt(s->s.rollNo));
        System.out.println(Arrays.toString(students));

        Arrays.sort(students,Comparator.comparingDouble(s->s.percentage));
        System.out.println(Arrays.toString(students));

    }
}


