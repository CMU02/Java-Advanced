package SolidPrinciple.Before.SRP;

/**
 * SRP (Single Responsibility Principle) 단일 책임 원칙 위반
 * ❌ Before : 한 클래스에 너무 많은 책임 (데이터 저장 + 출력 + 검증)
 */
public class BUserManager {
    public void saveUser(String name) {
        System.out.println("Saving user " + name);
    }

    public void printUser(String name) {
        System.out.println("Printing user " + name);
    }

    public boolean isValidUser(String name) {
        return name != null && !name.isEmpty();
    }

    public static void main(String[] args) {
        BUserManager bUserManager = new BUserManager();

        bUserManager.printUser("Tester");
        bUserManager.printUser("Tester");

        boolean isValid = bUserManager.isValidUser("Tester");
        System.out.println("isValid = " + isValid);
    }
}
