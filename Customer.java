public class Customer  extends Person2{
    public String lastName;
    private int customerNumber = getCustomerNumber();
    private int accountNumber;

    public Customer(String name, int phoneNumber, String address, String lastName) {
        super(name, phoneNumber, address, lastName);

    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getCustomerNumber(){
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber){
        this.customerNumber = customerNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                '}';
    }
}
