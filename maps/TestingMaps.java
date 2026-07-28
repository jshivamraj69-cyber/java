package maps;
import java.util.HashMap;
import java.util.Map;

public class TestingMaps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Shivam", 100);
        map.put("Shiam", 200);
        map.put("Shiva", 300); 
        map.put("Shiv", 100);
        map.put("Shivan", 200);
        System.out.println(map.size());
        System.out.println(map.get("Shivam"));
        System.out.println(map.containsKey("Shivam"));
        System.out.println(map.containsValue("Shiv"));
        System.out.println(map.remove("Shivan"));
        System.out.println(map.size());

        for (String key : map.keySet()) {
             System.out.println( key + ":" + map.get(key));
        }

    }
}
