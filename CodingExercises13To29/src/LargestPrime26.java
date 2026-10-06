public class LargestPrime26 {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(7));
    }

    public static int getLargestPrime(int number) {

        if (number <= 1) {
            return -1;
        }

        int largestPrime = 0;

        int counter = 2;

        while (counter <= number) {

            if (number % counter == 0) {

                int divisor = 2;
                boolean isPrime = true;

                while (divisor < counter) {

                    if (counter % divisor == 0) {
                        isPrime = false;
                        break;
                    }

                    divisor++;
                }

                if (isPrime) {
                    largestPrime = counter;
                }
            }

            counter++;
        }

        return largestPrime;
    }
}