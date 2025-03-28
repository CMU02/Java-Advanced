package SolidPrinciple.IntegratedDesign;

// 출력 책임 분리
public class ResultPrinter {
    public void print(int price) {
        System.out.println("최종 결제 금액: " + price);
    }
}
