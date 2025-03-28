package SolidPrinciple.After.SRP;

public class UserValidator {
    public boolean isValid(String name) {
        return name != null && !name.isEmpty();
    }
}
