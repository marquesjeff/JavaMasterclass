public class SumOddRange15 {

    public static boolean isOdd(int number) {
        if(number < 0){
           return false;
        }
        if(number % 2 == 0){
            return false;
        }
        return true;
    }

    public static int sumOdd(int start, int end) {
        if (start < 0 || end < 0){
            return -1;
        }
        if (end < start){
            return -1;
        }
        int sum = 0;
        for(; start <= end; start++){
            if(isOdd(start)){
                sum +=start;
            }
        }
        return sum;

    }
}
