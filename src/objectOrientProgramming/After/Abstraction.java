package objectOrientProgramming.After;

import Util.CardPaymentService;
import Util.OrderService;

public class Abstraction {
    public static void main(String[] args) {
        OrderService orderService = new OrderService(new CardPaymentService());

        orderService.createOrder();
    }
}
