package after;

import utill.Item;

public class Encapsulation {
    public static void main(String[] args) {
        Item java = new Item("JAVA", 1000);
        System.out.println("java.getName() = " + java.getName());
        System.out.println("java.getPrice() = " + java.getPrice());
    }
}
