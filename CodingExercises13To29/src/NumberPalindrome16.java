public class NumberPalindrome16 {

    public static void main(String[] args) {

        boolean checkNumber = isPalindrome(23);
        System.out.println("Is the number a palindrome? " + checkNumber);


    }
    public static boolean isPalindrome(int number){
            int lastDigit;
            int reverse = 0;
            int num = number;

            boolean theresDigit = true;

            while(theresDigit){

                lastDigit = num % 10;
                num /= 10;
                reverse = reverse * 10 + lastDigit;

                if(num == 0){
                    theresDigit = false;
                }

            }
            if(number == reverse){
                return true;
            }else{
                return false;
            }

        }

}
