package Collection.List;

import java.util.ArrayList;

/**
 * ✅ 특징
 * - 순서 유지 ○
 * - 중복 허용 ○
 * - 인덱스로 접근 ○
 */
public class ArrayListEX {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");

        System.out.println(fruits.get(0)); // 사과
        System.out.println("fruits List = " + fruits);


        // for-each 순회
        for (String fruit : fruits) {
            System.out.println("fruit = " + fruit);
        }
    }
}
