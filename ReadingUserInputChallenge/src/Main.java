import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int count = 1;
        boolean validNumber = false;
        int sum = 0;
        while(count <= 5){
            do{
                try{
                    System.out.println("Enter number #" + count + ": ");
                    String number1 = scanner.nextLine();
                    num = Integer.parseInt(number1);
                    sum += num;
                    validNumber = true;
                }catch(NumberFormatException e){
                    System.out.println("Invalid character! Try again!");
                }

            }while(!validNumber);

            count++;

        }

        System.out.println("The total sum was " + sum);

    }
}
