package SolidPrinciple.Before.OCP;

/**
 * OCP (Open-Closed Principle) 개방-폐쇠 원칙
 * ❌ Before: 새로운 할인 정책 추가 시, 조건문 수정 필요 (OCP 위반)
 */
public class DDiscountService {
    public int calculateDiscount(String type, int price) {
        if (type.equals("vip")) {
            return price - 1000;
        } else if (type.equals("gold")) {
            return price - 500;
        } else {
            return price;
        }
    }
}
