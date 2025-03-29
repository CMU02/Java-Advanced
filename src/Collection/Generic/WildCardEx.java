package Collection.Generic;

import java.util.ArrayList;
import java.util.List;

public class WildCardEx {
    /**
     * ? 사용 - 타입 불명, 읽기만 가능
     * 특징 : 어떤 타입이든 받을 수 있지만, 내부에 뭘 넣을 수 는 없음 -> 읽기 전용
     */
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println("obj = " + obj);
        }
    }

    /**
     * ? extends - 하위 타입만 받기
     * 특징 : Number 하위 타입이면 모두 받되, 읽기만 가능, 쓰기 제한
     */
    public static void sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }

        System.out.println("sum = " + sum);
    }

    /**
     * ? super - 상위 타입만 받기
     * 특징 : Interger의 상위 타입이면 받음 -> 쓰기 가능, 읽기는 Object로만 가능
     */
    public static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }

    public static void main(String[] args) {
        printList(List.of(1, 2, 3));
        printList(List.of("A", "B", "C"));

        sumNumbers(List.of(1, 2, 3)); // Integer
        sumNumbers(List.of(1.5, 2.5, 3.5)); // Double

        List<Number> list = new ArrayList<>();
        addNumbers(list); // Integer 넣기 Ok
        System.out.println("list = " + list);
    }
}
