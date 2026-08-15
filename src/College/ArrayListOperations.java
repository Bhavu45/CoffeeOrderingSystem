package College;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        System.out.println("Array List :"+l1);
        System.out.println("Element at index :"+l1.get(4));
        l1.set(3,60);
        System.out.println(l1);
        l1.add(3,40);
        l1.add(1,70);
        System.out.println(l1);
        l1.remove(1);
        System.out.println(l1);
        System.out.println("Size of the ArrayList:"+l1.size());
        System.out.println(l1.contains(20));
        System.out.println(l1.indexOf(30));
        Collections.sort(l1);
        System.out.println("Asc :"+l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("Desc :"+l1);
        l1.clear();
        System.out.println(l1);
    }
}
