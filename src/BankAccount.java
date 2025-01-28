/** Bank Account
Bob has a checking acount with Texas Bank with a starting balance of $2175.37.
Bob then performs the following transactions:
Bob withdrew $302.50.
Bob deposited $50.03.
Bob withdrew half of his current balance, then deposited $20.00.
Bob withdrew $1.
Bob deposited his paycheck that doubled his current balance.
Bob deposited $1.
Output Bob's new balance after all of his transactions.
 */
class Account {
    private
        String name="";
        double balance=0;

    public
    Account(String fName,double bal) {
        name= fName;
        balance= bal;
    }

    void withdraw(double val){
        balance-=val;
        System.out.println("Withdraw Complete.");
    }

    void deposit(double val){
        balance+=val;
        System.out.println("Deposit Complete.");
    }

    String displayBal() {
       return "Account Balance:$"+(Math.round(balance)*100.0)/100.0;
    }
};

public class BankAccount {
    public static void main(String[] args) {


        Account Account1 =new Account("Bob",2175.37);

        Account1.withdraw(302.50);
        Account1.deposit(50.03);
        Account1.withdraw(Account1.balance/2.0);
        Account1.deposit(20.00);
        Account1.withdraw(1);
        Account1.deposit(Account1.balance);
        Account1.deposit(1);
        System.out.println(Account1.displayBal());
        
    }
}
