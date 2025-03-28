package SolidPrinciple.After.OCP;

public class DiscountService {
    private DiscountPolicy policy;

    public DiscountService(DiscountPolicy policy) {
        this.policy = policy;
    }

    public int calculateDiscount(int price) {
        return policy.discount(price);
    }

    public static void main(String[] args) {
        VipDiscount vipDiscount = new VipDiscount();
        GoldDiscount goldDiscount = new GoldDiscount();

        DiscountService service = new DiscountService(goldDiscount);

        int result = service.calculateDiscount(5000);
        System.out.println(result);
    }
}
