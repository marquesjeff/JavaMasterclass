public class Main {

    public static void main(String[] args) {

        int numbersFound = 0;
        int totalSum = 0;
        for(int i = 1; i <= 1000; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
                numbersFound++;
                totalSum += i;
            }
            if(numbersFound == 5){
                break;
            }

        }
        System.out.println("The total sum of the numbers is " + totalSum);

    }
}
