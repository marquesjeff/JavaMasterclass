public class Main {

    public static void main(String[] args) {

        int primeNumberCounter = 0;

        for(int i = 0; i <= 1000; i++) {
            if(isPrime(i)){
                System.out.println(i + " is a prime number.");
                primeNumberCounter++;
            }else{
                System.out.println(i + " is not a prime number.");
            }
            if(primeNumberCounter == 3){
                break;
            }
        }
        System.out.println("Prime number counter is " + primeNumberCounter);
    }

    public static boolean isPrime(int wholeNumber) {

        if(wholeNumber < 2){
            return false;
        }
        for(int divisor = 2; divisor < wholeNumber; divisor++){
            if(wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;

    }
}
