package Collection.Map;

import java.util.HashMap;

/**
 * 키 중복 X
 * 값 중복 O
 * 탐색 속도 빠름
 */
public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, Integer> ageMap = new HashMap<>();

        ageMap.put("철수", 20);
        ageMap.put("영희", 22);
        ageMap.put("민수", 21);

        for (String name : ageMap.keySet()) {
            System.out.println(name + "의 나이: " + ageMap.get(name));
        }
    }
}
