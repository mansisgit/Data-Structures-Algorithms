import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        //list.remove(1);
        System.out.println(list.remove(1)+"removed by index");
        System.out.println(list.remove(Integer.valueOf(10))+"by value/object");
        System.out.println(Arrays.toString(list.toArray()));

    }

}
