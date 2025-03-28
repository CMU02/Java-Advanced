package SolidPrinciple.IntegratedDesign;


public class PaymentProcessor {
    private DiscountPolicy policy;
    private InputValidator inputValidator;
    private ResultPrinter resultPrinter;

    public PaymentProcessor(DiscountPolicy policy, InputValidator inputValidator, ResultPrinter resultPrinter) {
        this.policy = policy;
        this.inputValidator = inputValidator;
        this.resultPrinter = resultPrinter;
    }

    public void process(int price) {
        if (!inputValidator.isValidPrice(price)) {
            System.out.println("가격이 유효하지 않습니다.");
            return;
        }

        int finalPrice = policy.discount(price);
        resultPrinter.print(finalPrice);
    }

    public static void main(String[] args) {
        WeekendDiscount weekendDiscount = new WeekendDiscount();
        InputValidator inputValidator1 = new InputValidator();
        ResultPrinter resultPrinter1 = new ResultPrinter();

        PaymentProcessor processor = new PaymentProcessor(weekendDiscount, inputValidator1, resultPrinter1);
        processor.process(25000);
    }
}
