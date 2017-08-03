package Bank;

public class InsufficientFunds extends Exception {


    public InsufficientFunds() {
        super("You have insufficient funds!!");
    }
}
