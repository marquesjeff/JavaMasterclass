public class Main {

    public static void main(String[] args) {

        System.out.println(sumDigits(101));

    }

    public static int sumDigits(int number) {

        if(number < 0){
            return -1;
        }

        int totalSum = 0;
        int lastDigit;
        boolean theresDigit = true;

        while(theresDigit){

            lastDigit = number % 10;
            totalSum += lastDigit;
            number /= 10;

            if(number == 0){
                theresDigit = false;
            }

        }

        return totalSum;

    }


}
