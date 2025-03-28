package SolidPrinciple.StrategyPattern.Discount;

public class Order {
    private DiscountStrategy strategy;

    public Order(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public int checkout(int price) {
        return strategy.applyDiscount(price);
    }

    public static void main(String[] args) {

        FixedDiscount fixedDiscount = new FixedDiscount();
        NoDiscount noDiscount = new NoDiscount();
        PercentageDiscount percentageDiscount = new PercentageDiscount();

        Order order = new Order(percentageDiscount);

        int result = order.checkout(25000);
        System.out.println(result);
    }


}
