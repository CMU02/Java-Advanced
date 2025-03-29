package Collection.Generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 제네릭 클래스의 타입은 런타임에 사라짐
 * - 제네릭은 컴파일 시 타입만 검사하고, 런타임에는 모두 동일한 클래스
 */
public class TypeErasure {
    public static void main(String[] args) {
        // Ex1
        List<String> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        System.out.println(list1.getClass() == list2.getClass()); // true

        // Ex2
        List<String> list = new ArrayList<>();
        if (list instanceof List<String>) {
            /**
             * 해당 조건은 내부적으로 instanceof List로 동작되며,
             * 컴파일 에러는 나지 않지만, 타입 정보가 사라짐 (타입 이레이저)
             */
        }

        // Ex2
        List rawList = new ArrayList();
        rawList.add("A");
        rawList.add(123);

        list1 = rawList; // 경고 발생
//        String s = list1.get(1); // 예외 발생 ClassCastException
    }
}
