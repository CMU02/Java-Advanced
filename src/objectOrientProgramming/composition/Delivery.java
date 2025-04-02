package objectOrientProgramming.composition;

public class Delivery {
    public static void main(String[] args) {
        DeliveryTracker deliveryTracker = new DeliveryTracker();
        ExpressDeliveryService express = new ExpressDeliveryService(deliveryTracker);
        StandardDeliveryService standard = new StandardDeliveryService(deliveryTracker);

        express.deliveryPackage();
        System.out.println("==================");
        standard.deliveryPackage();
    }
}
