package Util;

/**
 * extend -> 상속
 * implements -> 구현
 */
public class KaKaoPayService implements PaymentService {
    public void processPayment() {
        log();
        System.out.println("카카오페이 결제 처리 중....");
    }
}
