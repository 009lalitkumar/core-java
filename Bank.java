class BankAccount {
    private final int accNo;
    private double accBalance;
    private String accHolderName;

    public BankAccount(int accNo, String accHolderName) {
        this.accNo = accNo;
        this.accHolderName = accHolderName;
    }

    public BankAccount(int accNo, String accHolderName, double accBalance) {
        this(accNo, accHolderName);
        this.accBalance = accBalance;
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
        return "accNo : " + accNo + "\naccHolderName : " + accHolderName + "\naccBalance : " + accBalance + "\n";
    }

}

class SavingAccount extends BankAccount {
    static double rateOfIntrest;

    public SavingAccount(int accNo, String accHolderName) {
        super(accNo, accHolderName);
        this.setAccHolderName(accHolderName);
    }

    public SavingAccount(int accNo, String accHolderName, double accBalance) {
        super(accNo, accHolderName, accBalance);
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

    public CurrentAccount(int accNo, String accHolderName) {
        super(accNo, accHolderName);
    }

    public CurrentAccount(int accNo, String accHolderName, double accBalance) {
        super(accNo, accHolderName, accBalance);
    }

    public CurrentAccount(double avgDailyTransaction, int accNo, String accHolderName) {
        super(accNo, accHolderName);
        this.avgDailyTransaction = avgDailyTransaction;
    }

    public CurrentAccount(double avgDailyTransaction, int accNo, String accHolderName, double accBalance) {
        super(accNo, accHolderName, accBalance);
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
        return "Current Account :-\n" + super.toString() + "avgDailyTransaction : " + this.avgDailyTransaction + "\n";
    }

    double getTotalTransactionAmount(int days) {
        return avgDailyTransaction * days;
    }

    double getYearlyTransaction() {
        return getTotalTransactionAmount(365);
    }
}

abstract class SalaryAccount extends BankAccount {
    double salary;
    double pfAmount;
    double incomeTaxRate;

    protected SalaryAccount(int accNo, String accHolderName) {
        super(accNo, accHolderName);
    }

    protected SalaryAccount(int accNo, String accHolderName, double accBalance) {
        super(accNo, accHolderName, accBalance);
    }

    @Override
    public String toString() {
        return super.toString() + "salary :" + salary + "\nincomeTaxRate=" + incomeTaxRate + "\npfAmount=" + pfAmount
                + "\n";
    }

    abstract double getYearlyTax();

    abstract double getInHandSalary();
}

public class Bank {
    public static void main(String[] args) {
        BankAccount generalAcc = new BankAccount(1, "Lalit");
        System.out.println(generalAcc);

        SavingAccount savingsAcc = new SavingAccount(2, "Yusuf");
        System.out.println(savingsAcc);
        SavingAccount.setRateOfIntrest(3.4);
        savingsAcc.setAccBalance(20000);
        System.out.println("getYearlyIntrest : " + savingsAcc.getYearlyInterest());
        System.out.println("getComputedInterest of 3 years : " + savingsAcc.getComputedInterest(3) + "\n");

        CurrentAccount currentAcc = new CurrentAccount(3, "Bheru", 1200.50);
        currentAcc.setAvgDailyTransaction(400);
        System.out.println(currentAcc);
        System.out.println("getYearlyTransaction : " + currentAcc.getYearlyTransaction());
        System.out.println("getTotalTransactionAmount of 10 days : " + currentAcc.getTotalTransactionAmount(10) + "\n");

        SalaryAccount salaryAcc = new SalaryAccount(4, "Dev") {

            double getYearlyTax() {
                return salary * incomeTaxRate * 12 / 100;
            }

            double getInHandSalary() {
                return (salary - getYearlyTax() / 12 - pfAmount);
            }

        };

        salaryAcc.salary = 50000;
        salaryAcc.pfAmount = 3000;
        salaryAcc.incomeTaxRate = 5;
        System.out.println("getYearlyTax : " + salaryAcc.getYearlyTax());
        System.out.println("Monthly getInHandSalary : " + salaryAcc.getInHandSalary());
    }
}
