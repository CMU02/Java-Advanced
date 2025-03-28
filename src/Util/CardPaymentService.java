package Util;

/**
 * extend -> 상속
 * implements -> 구현
 */
public class CardPaymentService implements PaymentService {
    public void processPayment() {
        log();
        System.out.println("카드 결제 처리 중....");
    }
}
