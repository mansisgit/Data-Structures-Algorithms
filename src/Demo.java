import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.remove(1);
        System.out.println(list.remove(Integer.valueOf(10)));

    }

}
