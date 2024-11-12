package Lab2;

public class Employee {
    private String name;
    private String employeeId;
    private String bankInfo;
    private String socialSecurityNumber;
    private String address;
    private String phoneNumber;
    private String email;
    private String paymentMethod;

    // Constructor
    public Employee(String name, String employeeId, String bankInfo, String socialSecurityNumber,
            String address, String phoneNumber, String email, String paymentMethod) {
        this.name = name;
        this.employeeId = employeeId;
        this.bankInfo = bankInfo;
        this.socialSecurityNumber = socialSecurityNumber;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.paymentMethod = paymentMethod;
    }

    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getBankInfo() {
        return bankInfo;
    }

    public void setBankInfo(String bankInfo) {
        this.bankInfo = bankInfo;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", bankInfo='" + bankInfo + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
