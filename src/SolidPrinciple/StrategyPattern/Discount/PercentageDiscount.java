package SolidPrinciple.StrategyPattern.Discount;

public class PercentageDiscount implements DiscountStrategy {
    @Override
    public int applyDiscount(int price) {
        return price * 90 / 100; // 10% 할인
    }
}
