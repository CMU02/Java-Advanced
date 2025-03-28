package Collection.Set;

import java.util.Set;
import java.util.TreeSet;

/**
 * 특징
 * - 자동 정렬 O (오름차순)
 * - 내부적으로 이진트리 구조
 * - 느리지만 순서 보장
 */
public class TreeSetEx {
    public static void main(String[] args) {
        Set<Integer> scores = new TreeSet<>();

        scores.add(70);
        scores.add(100);
        scores.add(85);
        scores.add(92);
        scores.add(65);

        System.out.println("scores = " + scores); // 오름차순 정렬된 점수
    }
}
