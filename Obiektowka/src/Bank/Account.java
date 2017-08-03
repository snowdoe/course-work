package Bank;

/**
 * Created by machu on 2017-04-02.
 */
public class Account {
    double depositValue;

    public void deposit(double amount){
        depositValue+=amount;
    }
    public void withdraw (double amount) throws InsufficientFunds{
        if (amount>depositValue) {
            throw new InsufficientFunds();
        }
        depositValue-=amount;
    }

    public Account(double depositValue) {
        this.depositValue = depositValue;
    }


    @Override
    public String toString() {
        return "Account{" +
                "depositValue=" + depositValue +
                '}';
    }
}
