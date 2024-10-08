package CollectionFrameWork.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* Map Interface : Key 와 Value 의 쌍으로 자료를 관리하는 인터페이스
*  구현체 HashMap, TreeMap, HashTable, Properties 가 있다 */
public class HashMapEx {
    public static void main(String[] args) {
        // Map 생성 <Key, Value>
        HashMap<String, Integer> map = new HashMap<>();
        // 객체 추가 <Key, Value>
        map.put("Apple", 1000);
        map.put("Banana", 2000);
        map.put("Orange", 3000);
        map.put("Melon", 4000);
        map.put("Banana", 5000);    // Key 값은 중복되지 않아 같은 Key 를 가지고 있으면 후에 추가된 같은 이름의 Key 로 대체된다

        System.out.println("Key 의 합계 : " + map.size());
        System.out.println("Apple 의 값은 : " + map.get("Apple"));
        System.out.println("Banana 의 값은 : " + map.get("Banana"));
        // 반복 순회 방법 (향상된 for 문을 이용하는 방법)
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
        // 이전 방식 순회 : 반복자 (iterator)를 이용하는 방식
        Set<String> keyset = map.keySet();
        Iterator<String> iterator = keyset.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " : " + map.get(key));
        }
    }
}
