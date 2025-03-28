package SolidPrinciple.After.SRP;

/**
 * ✅ After : 역할 별로 책임 분리 (SRP 적용)
 */
public class UserPrinter {
    public void printUser(String name) {
        System.out.println("Printing user " + name);
    }
}
