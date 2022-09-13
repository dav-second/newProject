public class SavingsAccount extends Accounts {

    private int accountNumber;
    private String accountName;
    private float balance;
    private float rateOfInterest;

    public SavingsAccount(String accountType, String branch, int accountPin) {
        super(accountType, branch, accountPin);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(float rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    //
    @Override
    public boolean deposit(int amount){
        balance += amount;
    }

    @Override
    public void createPin(int accountPin) {

    }

    @Override
    public int withDrawls(int amount) {
        return 0;
    }

    @Override
    public int withDrawl(int amount){
        return (int) balance;
    }

    @Override
    public float getBalance(){
        return balance;
    }

    public double calaculateInterest(double interestRate){
        double balance = 0 ;

        return (balance * interestRate);


    }

    public double calcualteInterest(){
        return balance + balance * rateOfInterest
    }


}
