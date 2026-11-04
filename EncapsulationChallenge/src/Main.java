public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer();
        System.out.println(printer);
        printer.addToner(50);
        System.out.println(printer);
        printer.setDuplex(true);
        printer.printPages(5);
        System.out.println(printer);


    }
}
