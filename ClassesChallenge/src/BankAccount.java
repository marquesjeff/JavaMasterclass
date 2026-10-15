public class BankAccount {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double money){
        this.accountBalance += money;
        System.out.println("New deposit of $" + money);
        System.out.println("Current Balance: $" + this.accountBalance);
    }

    public void withdrawFunds(double money){
        if(this.accountBalance - money < 0){
            this.accountBalance -= 0;
            System.out.println("Sorry. Withdraw of $" + money + " not permitted.");
            System.out.println("You can't have a negative Balance.");
        }else{
            this.accountBalance -= money;
            System.out.println("New withdraw of $" + money);
            System.out.println("Current Balance: " + this.accountBalance);
        }
    }

}
