package Collection.Set;

import java.util.Set;
import java.util.TreeSet;

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
