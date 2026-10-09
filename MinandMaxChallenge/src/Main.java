import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean isCharacter = false;
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int minValue = 0;
        int maxValue = 0;
        while(!isCharacter){
            System.out.println("Enter an integer number to continue or a character to quit: ");
            try{
                String number = scanner.nextLine();
                int validNumber = Integer.parseInt(number);
                if(counter == 0){
                    minValue = validNumber;
                    maxValue = validNumber;
                }else{
                    if(validNumber < minValue){
                        minValue = validNumber;
                    }else if(validNumber > maxValue){
                        maxValue = validNumber;
                    }
                }

                counter++;
            }catch(NumberFormatException e){
                isCharacter = true;
            }


        }

        System.out.println("The minimum value was " + minValue);
        System.out.println("The maximum value was " + maxValue);

    }
}
