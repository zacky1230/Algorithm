package Test;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("abc",1);
        hashMap.put("bbc",2);
        hashMap.put("cbc", 3);
        hashMap.put("dbc",4);
        System.out.println("abc".hashCode());
        System.out.println(hashMap.size());
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ":" +
            entry.getValue());
        }
        System.out.println(hashMap.containsKey("first"));
        System.out.println(hashMap.get("first"));
        System.out.println(hashMap.hashCode());
        System.out.println(TestHashMap.class.hashCode());
    }
}
