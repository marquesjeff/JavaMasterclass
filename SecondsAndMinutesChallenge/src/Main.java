public class Main{

public static void main(String[] args) {

    String getDate = getDurationString(0, 3600);

    System.out.print(getDate);

    }
public static String getDurationString(int seconds) {
    if(seconds < 0){
        return "Error. Data is negative.";
    }else{
        int totalMinutes = seconds / 60;
        int hours = totalMinutes / 60;
        int remainingMinutes = totalMinutes % 60;
        int remainingSeconds = seconds % 60;

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
    }

}

public static String getDurationString(int minutes, int seconds) {
    if(minutes < 0 || seconds < 0){
        return "Error. Data is Negative.";
    }
    int totalSeconds = minutes * 60 + seconds;
    return getDurationString(totalSeconds);
}
}

