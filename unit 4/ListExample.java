// package unit 4;
import java.util.ArrayList;
import java.util.List;
public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        System.out.println(list);    //Output: [Hello, World]
        list.set(1, "Java");
        System.out.println(list);    //Output: [Hello, Java, Java]`
        list.remove(0);
        System.out.println(list);    //Output: [Java, Java]
    }
}
