package string;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListOfString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        //System.out.println(list);
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String str=iterator.next();
            //iterator.remove();
            list1.add(str.toUpperCase());
           // System.out.print(iterator.next());
        }
        System.out.println(list1);
    }
}
