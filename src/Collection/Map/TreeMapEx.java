package Collection.Map;

import java.util.Map;
import java.util.TreeMap;

/**
 * 특징
 * - 키 기준 정렬 (문자열이면 사전순)
 * - 이진트리 구조 -> 탐색은 느리지만 순서 보장
 */
public class TreeMapEx {
    public static void main(String[] args) {
        Map<String, Integer> scoreMap = new TreeMap<>();

        scoreMap.put("지민", 85);
        scoreMap.put("민수", 92);
        scoreMap.put("영희", 78);

        System.out.println("정렬 된 성적표:");
        for (String name : scoreMap.keySet()) {
            System.out.println(name + " : " + scoreMap.get(name));
        }
    }
}
