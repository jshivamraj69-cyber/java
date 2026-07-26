package Collection_and_generics;

import java.util.ArrayList;
import java.util.List;
public class TestingList {
    public static void main(String[] args) {
        List strList = new ArrayList();
        strList.add("Shivam");
        strList.add("Raj");
        strList.add("Raaz");
        strList.remove("Raaz");

        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }
    }
}
