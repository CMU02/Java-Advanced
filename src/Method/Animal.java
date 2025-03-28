package Method;

/**
 * 부모 클래스의 메서드를 자식 클래스에서 재정의
 * -> 동적 바인딩 (런타임에 결정됨)
 * Point
 * - speak()는 상위 클래스 Animal에서 정의가 됨
 * - 하위 클래스가 `@Override`를 통해 동일한 메서드 이름/시그니처로 재정의]
 * - 실제 객체 타입에 따라 메서드 동작이 달라짐
 * - 동적 바인딩(Dynamic Binding)
 */
public class Animal {
    public void speak() {
        System.out.println("The animal makes a sound");
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.speak();

        Animal cat = new Cat();
        cat.speak();
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("멍멍!");
    }
}
class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("야옹~");
    }
}
