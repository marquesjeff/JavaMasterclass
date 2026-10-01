public class GreatestCommonDivisor22 {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 30));

    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if(first < 10 || second < 10){
            return -1;
        }

        int counter = 0;
        int divisor = 0;
        int num = first;
        if(second > first){
            num = second;
        }


        while(counter <= num){

            counter++;

            if(first % counter == 0 && second % counter == 0){
                divisor = counter;
            }

        }
        return divisor;

    }
}
