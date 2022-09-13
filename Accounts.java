public abstract class Accounts {

    private String accountType;
    private String branch;
    private int accountPin;

    private int balance;


    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getAccountPin() {
        return accountPin;
    }

    public void setAccountPin(int accountPin) {
        this.accountPin = accountPin;
    }



    public float getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Accounts(String accountType, String branch, int accountPin) {
        this.accountType = accountType;
        this.branch = branch;
        this.accountPin = accountPin;
    }

    //

    public abstract boolean deposit(int amount);

    public abstract int withDrawls(int amount);

    public void editPin(int newPin) {

    }
    public abstract void createPin(int accountPin);

}
