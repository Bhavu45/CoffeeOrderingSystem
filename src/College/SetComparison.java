package College;
import java.util.*;
public class SetComparison {
    public static void main(String[] args) {
        HashSet<Integer> hashset=new HashSet<>(Arrays.asList(30,10,20,50,40));
        LinkedHashSet<Integer> linkedhashset=new LinkedHashSet<>(Arrays.asList(30,10,20,50,40));
        TreeSet<Integer> treeset=new TreeSet<>(Arrays.asList(30,10,20,50,40));
        System.out.println(hashset);
        System.out.println(linkedhashset);
        System.out.println(treeset);
    }
}
