package SolidPrinciple.After.OCP;

public class GoldDiscount implements DiscountPolicy{
    @Override
    public int discount(int price) {
        return price - 500;
    }
}
