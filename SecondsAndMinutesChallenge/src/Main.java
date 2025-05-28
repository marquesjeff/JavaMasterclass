
public class Main {
    public static void main(String[] args) {


        int seconds = 3965;
        String minutes = calculateHours(seconds);
        System.out.println(minutes);

        minutes = calculateHours(59, 65);
        System.out.println(minutes);



    }

    public static String calculateHours(int seconds){

        if(seconds < 0){
            return "Invalid seconds data.";
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return calculateHours(remainingSeconds, minutes);

    }

    public static String calculateHours(int seconds, int minutes){

        if(minutes < 0){
            return "Invalid minutes data.";
        }

        if(seconds < 0 || seconds > 59){
            return "Invalid seconds data.";

        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        return hours + "h" + remainingMinutes + "m" + remainingSeconds + "s";

    }


}