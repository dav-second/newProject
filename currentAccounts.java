public class currentAccounts extends Accounts {

    private int accountNo;
    private String accountName;
    private int balance;
    private double overDraft;
    private int rateOfInterest;

    private int pin;


    public void deposit() {

    }


    public static double deposit(int pin, double deposit) {

        if (pin != getPin()) {
            System.out.println("Pin entered is incorrect");

        }

    }



    @Override
    public int withDrawls(int amount){
        return 0;
    }

    @Override
    public void createPin(int accountPin) {

    }


    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getOverDraft() {
        return overDraft;
    }

    public void setOverDraft(double overDraft) {
        this.overDraft = overDraft;
    }

    public int getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(int rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean deposit(int amount) {
        return false;
    }
}


