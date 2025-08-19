package Assignment;

public class Account {
    String accountHolder;  
    double balance;        

    public static void main(String[] args) {
        Account acc = new Account(); 
        System.out.println("Account Holder: " + acc.accountHolder);
        System.out.println("Balance: " + acc.balance);
    }
}

