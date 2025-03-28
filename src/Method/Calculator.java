package Method;

/**
 * 같은 이름의 메서드를 다양한 매개변수 형태로 정의
 * -> 정적 바인딩(컴파일 타임에 결정됨)
 * Point
 * - add 메서드 이름은 같지만, 매개변수 타입 및 개수가 다름
 * - 컴파일러가 정확히 어던 메서드를 호출할지 미리 알 수 있음
 * - 정적 바인딩(Static Binding)
 */

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int ...arg) {
        int sum = 0;
        for (int i = 0; i < arg.length; i++) {
            sum += arg[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(1.5, 2.5));
        System.out.println(add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}
