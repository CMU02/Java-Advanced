package SolidPrinciple.IntegratedDesign;


public class WeekendDiscount implements DiscountPolicy {
    @Override
    public int discount(int price) {
        return price * 90 / 100; // 10% 할인
    }
}
