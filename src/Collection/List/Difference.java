package Collection.List;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * ✅ LinkedList와 ArrayList 차이
 * 조회 속도 : [ArrayList, 빠름], [LinkedList, 느림]
 * 앞족 삽입/삭제 : [ArrayList, 느림], [LinkedList, 빠름]
 * 메모리 : [ArrayList, 적음], [LinkedList, 더 사용]
 */

/**
 * 조회속도가 ArrayList 빠른 이유는?
 * - 내부적으로 배열을 사용하고 있으며, 메모리 상에 연속적 저장된다.
 * - get(index) 메서드를 사용하면 해당 위치로 바로 점프하며, 데이터를 조회한다.
 *
 * 반면, LinkedList 느린 이유는?
 * - 내부적으로 노드(Node) 객체가 앞뒤로 연결된 구조
 * - get(index) 할 때, 처음부터 하나씩 이동해야 함
 * Ex: get(3) -> firstNode -> SecondNode -> ThirdNode
 *
 * 정리
 * - 자주 조회한다고 하면 ArrayList
 * - 앞뒤 삽입/삭제가 많다면 LinkedList
 */
public class Difference {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        int count = 10000;

        // ArrayList 시간 측정
        long startTime = System.nanoTime();
        for (int i = 0; i < count; i++) {
            arrayList.add(0, i);
        }
        long endTime = System.nanoTime();
        long arrayListTime = endTime - startTime;

        // LinkedList 시간 측정
        startTime = System.nanoTime();
        for (int i = 0; i < count; i++) {
            linkedList.add(0, i);
        }
        endTime = System.nanoTime();
        long linkedListTime = endTime - startTime;

        System.out.println("ArrayList 앞에 삽입 시간: " + arrayListTime / 1_000_000.0 + " ms");
        System.out.println("LinkedList 앞에 삽입 시간: " + linkedListTime / 1_000_000.0 + " ms");
    }
}
