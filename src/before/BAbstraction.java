package before;

import utill.CardPaymentService;

/**
 * 구체 구현에 직접 의존 -> 유연하지 않음
 */
class BOrderService {
    private CardPaymentService cardPaymentService = new CardPaymentService();

    public void createOrder() {
        cardPaymentService.processPayment();
    }
}
public class BAbstraction {
    public static void main(String[] args) {
        BOrderService orderService = new BOrderService();
        orderService.createOrder();
    }
}
