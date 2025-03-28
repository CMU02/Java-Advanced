package Util;

/**
 * 1. 공통 기능 상속 -> 중복 제거
 * 2. 추상클래스 -> 결제 방식 변경이 쉬움
 * 3. 인터페이스
 */
public interface PaymentService {
    default void log() {
        System.out.println("결제 로그 기록 중....");
    }
    void processPayment();
}
