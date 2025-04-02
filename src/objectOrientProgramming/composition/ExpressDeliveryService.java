package objectOrientProgramming.composition;

public class ExpressDeliveryService  {
    private final DeliveryTracker tracker;

    public ExpressDeliveryService(DeliveryTracker tracker) {
        this.tracker = tracker;
    }

    public void deliveryPackage() {
        tracker.track();
        System.out.println("익스프레스 배송 중....");
    }
}
