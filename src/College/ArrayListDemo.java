package College;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Object> list1=new ArrayList<>();
        list1.add(45);
        list1.add(67.8);
        list1.add("Java");
        list1.add(true);
        list1.add('A');
        System.out.println(list1);
        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(10,15,25,45,75));
        System.out.println(list2);
        list1.addAll(list2);
        System.out.println(list1);
    }
}
