package SolidPrinciple.StrategyPattern.Discount;

public class FixedDiscount implements DiscountStrategy {
    @Override
    public int applyDiscount(int price) {
        return price - 1000;
    }
}
