// package unit 4;
import java.util.ArrayList;
import java.util.Iterator;

public class javaiterable {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Apples");
        list.add("Bananas");
        list.add("Oranges");
        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
