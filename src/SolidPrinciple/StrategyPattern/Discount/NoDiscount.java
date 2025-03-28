package SolidPrinciple.StrategyPattern.Discount;

public class NoDiscount implements DiscountStrategy{
    @Override
    public int applyDiscount(int price) {
        return price;
    }
}
