public class Main {

    public static void main(String[] args) {

        SalariedEmployee john = new SalariedEmployee("John", "05/11/1970",
                "20/11/1994", 50000.00);
        john.collectPay();
        john.terminate("01/01/2000");
        john.retire();
        john.collectPay();
        john.getAge();
        System.out.println(john);


    }
}
