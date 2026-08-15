package College;
import java.util.Stack;
public class StackDemo{
        public static void main(String[] args) {
            Stack<Integer> st=new Stack<>();
            st.push(10);
            st.push(20);
            st.push(30);
            System.out.println("Stack :"+st);
            System.out.println("Top :"+st.peek());
            System.out.println("Remove Topmost element:"+st.pop());
            System.out.println(st);
            System.out.println("Size :"+st.size());
            System.out.println("Full/Empty :"+st.isEmpty());
            System.out.println("Position of :"+st.search(20));
            System.out.println("Present :"+st.contains(40));
            st.add(40);
            System.out.println(st);
        }
    }