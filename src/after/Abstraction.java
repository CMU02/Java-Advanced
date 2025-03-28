package after;

import utill.CardPaymentService;
import utill.KaKaoPayService;
import utill.OrderService;

public class Abstraction {
    public static void main(String[] args) {
        OrderService orderService = new OrderService(new CardPaymentService());

        orderService.createOrder();
    }
}
