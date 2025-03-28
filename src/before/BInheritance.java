package before;

/**
 * 중복되는 코드가 여러 클래스에 반복
 */
class BCardPaymentService {
    public void log() {
        System.out.println("결제 로그 기록 중.....");
    }
    public void processPayment() {
        log();
        System.out.println("카드 결제 처리 중.....");
    }
}
class BKaKaoPayService {
    public void log() {
        System.out.println("결제 로그 기록 중.....");
    }
    public void processPayment() {
        log();
        System.out.println("카카오페이 결제 처리 중.....");
    }
}

public class BInheritance {
    public static void main(String[] args) {
        BCardPaymentService bCardPaymentService = new BCardPaymentService();
        BKaKaoPayService bKaKaoPayService = new BKaKaoPayService();

        bKaKaoPayService.processPayment();
        bCardPaymentService.processPayment();
    }
}
