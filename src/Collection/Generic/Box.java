package Collection.Generic;

/**
 * 특징
 * - 타입에 따라 컴파일 단계에서 타입 안정성 확보 (Object 없이도 형변환 없이 사용)
 * @param <T>
 */
public class Box<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello");

        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(123);

        System.out.println("stringBox = " + stringBox.getItem());
        System.out.println("integerBox = " + integerBox.getItem());
    }
}
