package after;

import utill.CardPaymentService;
import utill.KaKaoPayService;

public class Inheritance {
    public static void main(String[] args) {
        CardPaymentService cardPaymentService = new CardPaymentService();
        KaKaoPayService kaKaoPayService = new KaKaoPayService();

        cardPaymentService.processPayment();
        kaKaoPayService.processPayment();
    }
}
