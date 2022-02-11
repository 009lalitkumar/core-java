class Account {
    double balance;
    String accountHolder;

    protected void debit(double amount) {
        if (this.balance < amount) {
            System.out.println("Insufficient Balance");
        } else {
            this.balance -= amount;
            System.out.println("Transaction Successful");
        }
        System.out.println("Balance : " + this.balance);
    }

    protected void credit(double amount) {
        this.balance += amount;
        System.out.println("Credit Successful ");
        System.out.println("Updated Balance : " + this.balance);
    }
}

public class BankAccounts {

    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account();
        a1.balance = 1000;
        a1.accountHolder = "Bheru";
        a2.balance = 1200;
        a2.accountHolder = "Yusuf";
        a1.debit(300);
        a1.debit(701);
        a1.credit(120);
    }
}
