public class FactorPrinter21 {

    public static void main(String[] args) {

        printFactors(32);
    }

    public static void printFactors(int number) {

        if(number < 1){
            System.out.println("Invalid Value");
        }

        int counter = 1;
        int factor = 0;
        while(counter <= number){
            if(number % counter == 0){
                factor = counter;
                System.out.println(factor);

            }
            counter++;

        }

    }
}
