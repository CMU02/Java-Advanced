package objectOrientProgramming.After;

import Util.CardPaymentService;
import Util.KaKaoPayService;
import Util.OrderService;
import Util.PaymentService;

public class Polymorphism {
    public static void main(String[] args) {
        // 다양한 구현체를 하나의 타입으로 처리 가능
        PaymentService cardPaymentService = new CardPaymentService();
        PaymentService kaKaoPayService = new KaKaoPayService();

        OrderService orderService1 = new OrderService(cardPaymentService);
        OrderService orderService2 = new OrderService(kaKaoPayService);

        orderService1.createOrder(); // 카드 결제 처리
        orderService2.createOrder(); // 카카오페이 결제 처리
    }
}
