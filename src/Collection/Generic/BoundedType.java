package Collection.Generic;

/**
 * 숫자 타입만 받아서 doubleValue() 같은 숫자 연산 메서드 사용 가능
 * @param <T>
 */
public class BoundedType<T extends Number> {
    public double doubleValue(T value) {
        return value.doubleValue() * 2;
    }

    public static void main(String[] args) {
        BoundedType<Integer> c1 = new BoundedType<>();

        System.out.println(c1.doubleValue(5));

//        BoundedType<String> c2 = new BoundedType<String>(); 컴파일 에러
    }
}
