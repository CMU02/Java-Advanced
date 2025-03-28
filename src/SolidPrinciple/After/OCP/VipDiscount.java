package SolidPrinciple.After.OCP;

public class VipDiscount implements DiscountPolicy {
    @Override
    public int discount(int price) {
        return price - 1000;
    }
}
