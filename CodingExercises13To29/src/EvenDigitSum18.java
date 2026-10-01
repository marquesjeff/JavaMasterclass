public class EvenDigitSum18 {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456789));

    }

    public static int getEvenDigitSum(int number) {

        if(number < 0){
            return -1;
        }

        int firstDigit = 0;
        int sum = 0;
        boolean theresDigit = true;

        while(theresDigit){

            firstDigit = number % 10;
            number /= 10;

            if (firstDigit % 2 == 0) {
                sum += firstDigit;
            }

            if(number == 0){
                theresDigit = false;
            }

        }

        return sum;

    }

}
