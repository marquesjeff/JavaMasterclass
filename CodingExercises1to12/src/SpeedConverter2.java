public class SpeedConverter2 {

    public static long toMilesPerHour(double kilometersPerHour) {

        long miles;

        if (kilometersPerHour < 0){
            miles = -1;
            return miles;
        }else{
            miles =  Math.round(kilometersPerHour / 1.609);
            return miles;
        }

    }

    public static void printConversion(double kilometersPerHour) {

        long miles = toMilesPerHour(kilometersPerHour);

        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else{
            System.out.println(kilometersPerHour +
                    " km/h = " + miles + " mi/h");
        }

    }
}
