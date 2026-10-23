public class Main {
    public static void main(String[] args) {

        Customer john01 = new Customer();
        System.out.println("Customer name: " + john01.getName());
        System.out.println("Customer email: " + john01.getEmailAddress());
        System.out.println("Customer credit: " + john01.getCreditLimit());

        Customer john02 = new Customer("Johann", "johann@ninna.com");
        System.out.println("Customer name: " + john02.getName());
        System.out.println("Customer email: " + john02.getEmailAddress());
        System.out.println("Customer credit: " + john02.getCreditLimit());


    }
}
