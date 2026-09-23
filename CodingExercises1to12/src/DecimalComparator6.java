public class DecimalComparator6 {

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {


        if((long) (number1 * 1000) == (long) (number2 * 1000)){
            return true;
        }
        return false;

    }
}
