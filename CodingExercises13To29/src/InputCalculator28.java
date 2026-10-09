import java.util.Scanner;

public class InputCalculator28 {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();


    }

    public static void inputThenPrintSumAndAverage () {

        Scanner scanner = new Scanner(System.in);
        boolean isInteger = true;
        int totalSum = 0;
        int average = 0;
        int counter = 1;

        while(isInteger){
            System.out.println("Enter an integer number to continue: ");
            try{
                String number = scanner.nextLine();
                int validNumber = Integer.parseInt(number);
                totalSum += validNumber;
                average = totalSum / counter;
                counter ++;
            }catch(NumberFormatException e){
                System.out.println("SUM = " + totalSum + " AVG = " + average);
                isInteger = false;

            }
        }

    }
}
