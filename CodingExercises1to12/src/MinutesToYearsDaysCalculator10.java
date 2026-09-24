public class MinutesToYearsDaysCalculator10 {


    public static void printYearsAndDays(long minutes) {
        if(minutes < 0){
            System.out.println("Invalid Value");
        }else {
            double totalHours = minutes / 60;
            double totalDays = totalHours / 24;
            double remainingDays = totalDays % 365;
            double totalYears = totalDays / 365;

            System.out.println(minutes + " min = " + (long) totalYears +
                    " y and " + (long) remainingDays + " d");
        }

    }
}
