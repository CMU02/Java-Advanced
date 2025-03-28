package Collection.Set;
import java.util.*;

/**
 * 특징
 * - 순서 없음
 * - 중복 X
 * - 탐색 빠름
 */
public class HashSetEx {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("철수");
        names.add("영희");
        names.add("철수"); // 중복 추가 시 무시

        System.out.println("names.size() = " + names.size());

        for (String name : names) {
            System.out.println("name = " + name);
        }
    }
}
