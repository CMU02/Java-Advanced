package before;

import utill.CardPaymentService;
import utill.KaKaoPayService;

/**
 * 구현 클래스마다 별도 처리 -> if/else 남발
 */
class B1OrderService {
    public void createOrder(String paymentType) {
        if (paymentType.equals("Card")) {
            CardPaymentService cardPaymentService = new CardPaymentService();
            cardPaymentService.processPayment();
        } else if (paymentType.equals("Kakao")) {
            KaKaoPayService kaKaoPayService = new KaKaoPayService();
            kaKaoPayService.processPayment();
        }
    }
}

public class BPolymorphism {
    public static void main(String[] args) {
        B1OrderService b1OrderService = new B1OrderService();
        b1OrderService.createOrder("Card");
    }
}
