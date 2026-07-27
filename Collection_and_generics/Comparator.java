package Collection_and_generics;

import org.w3c.dom.DOMStringList;

import java.util.*;
import java.util.Collections;

public class Comparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bear","Lion","Ant","Zebra");
        System.out.println(list);
        sortInDescending(list);
        System.out.println();

    }
    public static <list> void sortInDescending(List<String>Stringlist){
        Collections collections;
Collections.reverse(Stringlist);
Collections.sort(Stringlist,Collections.reverseOrder());
    }
}
