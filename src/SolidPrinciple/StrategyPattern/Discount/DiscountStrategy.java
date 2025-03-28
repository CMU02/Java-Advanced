package SolidPrinciple.StrategyPattern.Discount;

/**
 * 전략 인터페이스
 * 다양한 할인 정책 (확장 가능)
 */
public interface DiscountStrategy {
    int applyDiscount(int price);
}
