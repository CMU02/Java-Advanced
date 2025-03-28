package Util;

/**
 * 다형성 적용 - if 없이 하나의 타입으로 처리
 */
public class OrderService {
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void createOrder() {
        paymentService.processPayment();
    }
}
