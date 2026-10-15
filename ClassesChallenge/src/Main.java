public class Main {

    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount();
        System.out.println("Customer: " + myAccount.getCustomerName());
        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Current Balance: " + myAccount.getAccountBalance());
        myAccount.setCustomerName("Jefferson");
        myAccount.setAccountNumber(1);
        myAccount.setAccountBalance(100.0);
        System.out.println("Customer: " + myAccount.getCustomerName());
        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Current Balance: " + myAccount.getAccountBalance());
        myAccount.depositFunds(50.50);
        myAccount.withdrawFunds(10.0);
        myAccount.withdrawFunds(150.0);
    }
}
