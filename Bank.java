import java.util.Scanner;

class BankAccount {
    static int count = 1;
    int accNo;
    private double accBalance;
    private String accHolderName;

    public BankAccount(String accHolderName) {
        this.accNo = count;
        count++;
        this.accHolderName = accHolderName;
    }

    public BankAccount(String accHolderName, double accBalance) {
        this(accHolderName);
        this.accBalance = accBalance;
    }

    public BankAccount(BankAccount account) {
        this.accNo = account.accNo;
        this.accHolderName = account.accHolderName;
        this.accBalance = account.accBalance;
    }

    public int getAccNo() {
        return accNo;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    @Override
    public String toString() {
        return "accNo : " + accNo + "\naccHolderName : " + accHolderName +
                "\naccBalance : " + accBalance + "\n";
    }

    public static BankAccount copy(BankAccount acc) {
        return new BankAccount(acc);
    }
}

class SavingAccount extends BankAccount {
    static double rateOfIntrest;

    public SavingAccount(String accHolderName) {
        super(accHolderName);
        this.setAccHolderName(accHolderName);
    }

    public SavingAccount(String accHolderName, double accBalance) {
        super(accHolderName, accBalance);
    }

    public double getRateOfIntrest() {
        return rateOfIntrest;
    }

    public static void setRateOfIntrest(double roi) {
        rateOfIntrest = roi;
    }

    @Override
    public String toString() {
        return "Savings Account :-\n" + super.toString();
    }

    double getYearlyInterest() {
        return (this.getAccBalance() * rateOfIntrest / 100);
    }

    double getComputedInterest(int years) {
        return this.getYearlyInterest() * years;
    }
}

class CurrentAccount extends BankAccount {
    double avgDailyTransaction;

    public CurrentAccount(String accHolderName) {
        super(accHolderName);
    }

    public CurrentAccount(String accHolderName, double accBalance) {
        super(accHolderName, accBalance);
    }

    public CurrentAccount(double avgDailyTransaction, String accHolderName) {
        super(accHolderName);
        this.avgDailyTransaction = avgDailyTransaction;
    }

    public CurrentAccount(double avgDailyTransaction, String accHolderName,
            double accBalance) {
        super(accHolderName, accBalance);
        this.avgDailyTransaction = avgDailyTransaction;
    }

    public double getAvgDailyTransaction() {
        return avgDailyTransaction;
    }

    public void setAvgDailyTransaction(double avgDailyTransaction) {
        this.avgDailyTransaction = avgDailyTransaction;
    }

    @Override
    public String toString() {
        return "Current Account :-\n" + super.toString() + "avgDailyTransaction : " +
                this.avgDailyTransaction + "\n";
    }

    double getTotalTransactionAmount(int days) {
        return avgDailyTransaction * days;
    }

    double getYearlyTransaction() {
        return getTotalTransactionAmount(365);
    }
}

public class Bank {
    public static void classesDemos() {
        BankAccount generalAcc = new BankAccount("Lalit");
        System.out.println(generalAcc);

        SavingAccount savingsAcc = new SavingAccount("Yusuf");
        System.out.println(savingsAcc);
        SavingAccount.setRateOfIntrest(3.4);
        savingsAcc.setAccBalance(20000);
        System.out.println("getYearlyIntrest : " + savingsAcc.getYearlyInterest());
        System.out.println("getComputedInterest of 3 years : " +
                savingsAcc.getComputedInterest(3) + "\n");

        CurrentAccount currentAcc = new CurrentAccount(3, "Bheru", 1200.50);
        currentAcc.setAvgDailyTransaction(400);
        System.out.println(currentAcc);
        System.out.println("getYearlyTransaction : " +
                currentAcc.getYearlyTransaction());
        System.out.println("getTotalTransactionAmount of 10 days : " +
                currentAcc.getTotalTransactionAmount(10) + "\n");
    }

    public static BankAccount salaryAccount(String name) {
        return new BankAccount(name) {
            double salary = 50000;
            double pfAmount = 6000;
            double incomeTaxRate = 5.5;

            double getYearlyTax() {
                return salary * incomeTaxRate * 12 / 100;
            }

            double getInHandSalary() {
                return (salary - getYearlyTax() / 12 - pfAmount);
            }

            @Override
            public String toString() {
                return super.toString() + "salary : " + this.salary + ", pfAmount : " +
                        this.pfAmount + "\n Yearly Tax : " + getYearlyTax() + "\nIn Hand Salary(Monthly) : "
                        + getInHandSalary() + "\n";
            }
        };
    }

    public static void main(String[] args) {
        classesDemos();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no. of Accounts you wanna Create : ");
        int n = scanner.nextInt();

        SavingAccount[] savingsArray = new SavingAccount[n];
        CurrentAccount[] currentArray = new CurrentAccount[n];
        BankAccount[] salaryArray = new BankAccount[n];

        for (int i = 0; i < n; i++) {
            savingsArray[i] = new SavingAccount("saving " + (i + 1), 20000.0 * i);
            currentArray[i] = new CurrentAccount("current " + (i + 1));
            salaryArray[i] = salaryAccount("Salary " + (i + 1));
            System.out.println(savingsArray[i]);
            System.out.println(currentArray[i]);
            System.out.println(salaryArray[i]);
        }

        BankAccount copySavingAccount = new BankAccount(savingsArray[0]);
        System.out.println("Copy Account -\n" + copySavingAccount);

        BankAccount copyCurrentAccount = BankAccount.copy(currentArray[0]);
        System.out.println("Copy Account -\n" + copyCurrentAccount);

        scanner.close();
    }
}
