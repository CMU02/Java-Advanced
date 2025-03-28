package SolidPrinciple.After.SRP;

/**
 * ✅ After : 역할 별로 책임 분리 (SRP 적용)
 */
public class UserRepository {
    public void saveUser(String username) {
        System.out.println("Saving user " + username);
    }
}
