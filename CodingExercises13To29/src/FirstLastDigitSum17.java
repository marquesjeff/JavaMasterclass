public class FirstLastDigitSum17 {

    public static void main(String[] args) {

        System.out.println( sumFirstAndLastDigit(-10));

    }

    public static int sumFirstAndLastDigit(int number) {

        if(number < 0){
            return -1;
        }
        int firstDigit = 0;
        int lastDigit = number % 10;
        int num = number;

        boolean theresDigit = true;

        while(theresDigit){

            firstDigit = num % 10;
            num /= 10;

            if(num == 0){
                theresDigit = false;
            }

        }

        int sum = firstDigit + lastDigit;
        return sum;

    }
}
