package Bank;

/**
 * Created by machu on 2017-04-02.
 */
public class Test {
    public static void main(String[] args) {
        Account account = new Account(100);

        try {
            account.withdraw(101);
        }
        catch (InsufficientFunds e){
            System.out.println(e.getMessage());

        }
        finally{
            System.out.println(account);
        }
    }

}
