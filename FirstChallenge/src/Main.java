
public class Main {
    public static void main(String[] args) {

        double firstNumber = 20.00d;
        double secondNumber = 80.00d;
        double thirdNumber = ((firstNumber + secondNumber) * 100.00d)  % 40.00d;
        boolean remainderIsZero = (thirdNumber == 0) ? true : false;

        if(!remainderIsZero){
            System.out.println("Got some remainder.");
        }else{
            System.out.println("No remainder.");
        }


    }
}