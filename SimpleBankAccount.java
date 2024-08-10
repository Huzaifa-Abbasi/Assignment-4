/*Simple Bank Account:
•	Create a BankAccount class with attributes like account number, balance, and account holder name.
•	Implement methods for depositing and withdrawing money, checking the balance, and displaying account details.
•	Create multiple BankAccount objects and perform banking operations
 */

class BankAccount{
    int account_number;
    int balance;
    String holder_name;

    public BankAccount(int account_number, int balance, String holder_name){
        this.account_number = account_number;
        this.balance = balance;
        this.holder_name = holder_name;
    }

    public int depositing(int deposit){
        
        balance += deposit;
        System.out.println(deposit+" amount is Deposit");
        return balance;
    }

    public int withdrawing(int withdraw){
        if (withdraw <= balance){
            balance -= withdraw;
            System.out.println(withdraw+" Amount Is Successfully Withdraw");
        }else {
            System.out.println("Insufficient Balance");
        }
        return balance;

    }
        
        
    

    public int checking(){
        System.out.println("Your Current Balance is: "+balance);
        return balance;
    }

    public void details(){
        System.out.println("Account Number: "+account_number+" "+"Balance: "+balance+" "+"Holder's name: "+holder_name);
    }
}

public class SimpleBankAccount{
    public static void main(String[] args) {

        int deposit = 10;
        int withdraw = 100;

        BankAccount Bank1 = new BankAccount(23, 100, "ali");

        BankAccount Bank2 = new BankAccount(20, 200, "sam" );


        


        Bank1.depositing(deposit);
        Bank1.withdrawing(withdraw);
        Bank1.checking();
        Bank1.details();


        Bank2.depositing(deposit);
        Bank2.withdrawing(withdraw);
        Bank2.checking();
        Bank2.details();
    }
}