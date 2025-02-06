package JavaCollection.MapInterface;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
//        Map<String, Object> hashMap = new HashMap<>();
        Map<String, Object> hashMap = new LinkedHashMap<>();


        hashMap.put("timestamp", new Date());
        hashMap.put("status", 200);
        hashMap.put("path", "/api/v1/users");
        hashMap.put("error", "Not Found");
        hashMap.put("message", "OK");
        hashMap.put(null, "A");
        hashMap.put(null, "B");
        hashMap.put(null, "C");

        hashMap.put("1", null);
        hashMap.put("2", null);
        hashMap.put("3", null);

        for (String key : hashMap.keySet()) {
            System.out.println(key + ": " + hashMap.get(key));
        }
        if (hashMap.containsKey("status")){
            System.out.println("Key null: " + hashMap.get("status"));
        }
    }
}
