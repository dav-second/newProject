public class Employees extends Person2 {

    private int employeeNo;
    private String Address;
    private int salary;



    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getEmployeeNo() {
        return employeeNo;
    }

    public Employees(String name, int phoneNumber, String address, String lastName, int employeeNo, String address1, int salary) {
        super(name, phoneNumber, address, lastName);
        this.employeeNo = employeeNo;
        Address = address1;
        this.salary = salary;
    }

    public void setEmployeeNo(int employeeNo) {
        this.employeeNo = employeeNo;
    }

    @Override
    public String getAddress() {
        return Address;
    }

    @Override
    public void setAddress(String address) {
        Address = address;
    }
}
