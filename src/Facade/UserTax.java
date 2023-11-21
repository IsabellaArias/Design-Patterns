package Facade;

public class UserTax {
    private Research research;

    public UserTax() {
        this.research = new Research();
    }

    public void checkTax() {
        research.researchUser();
        research.billUser();
    }
}
