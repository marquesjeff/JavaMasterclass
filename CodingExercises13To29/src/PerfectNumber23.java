public class PerfectNumber23 {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(5));

    }

    public static boolean isPerfectNumber(int number) {

        if (number < 1){
            return false;
        }


        int counter = 0;
        int divisor = 0;
        int num = number;

        while(counter < num){

            counter++;

            if(num % counter == 0 && num != counter){
                divisor += counter;
            }

        }
        return divisor == number;

    }
}
