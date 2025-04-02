package objectOrientProgramming.composition;

public class StandardDeliveryService {
    private final DeliveryTracker tracker;

    public StandardDeliveryService(DeliveryTracker tracker) {
        this.tracker = tracker;
    }

    public void deliveryPackage() {
        tracker.track();
        System.out.println("일반 배송 중....");
    }
}
