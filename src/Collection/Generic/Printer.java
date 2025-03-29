package Collection.Generic;

/**
 * 메서드 단위에서도 타입을 일반화해서 재사용성 향상
 */
public class Printer {
    public static <T> void print(T value) {
        System.out.println("출력 값 = " + value);
    }

    public static void main(String[] args) {
        print("Tester");
        print(42);
        print(3.14);
    }
}
