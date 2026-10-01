public class SharedDigit19 {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(45, 13));

    }

    public static boolean hasSharedDigit(int number1, int number2) {
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        }

        int digit1;
        int digit2;
        int num1 = number1;
        int num2;

        while (num1 > 0) {
            digit1 = num1 % 10;
            num2 = number2;
            while (num2 > 0) {
                digit2 = num2 % 10;
                if (digit1 == digit2) {
                    return true;
                }
                num2 /= 10;
            }
            num1 /= 10;
        }
        return false;
    }


}
