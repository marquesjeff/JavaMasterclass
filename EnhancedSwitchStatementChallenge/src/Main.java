public class Main {
    public static void main(String[] args) {

        printDayOfWeek(0);
        printWeekDay(7);
}
    public static void printDayOfWeek(int day) {

        String dayOfTheWeek = switch(day){
            case 0 -> { yield "Sunday";}
            case 1 -> { yield "Monday";}
            case 2 -> { yield "Tuesday";}
            case 3 -> { yield "Wednesday";}
            case 4 -> { yield "Thursday";}
            case 5 -> { yield "Friday";}
            case 6 -> { yield "Saturday";}
            default -> { yield "ERROR";}

        };
        System.out.println(day + " day of the week is " + dayOfTheWeek);

    }

    public static void printWeekDay(int day) {
        String dayOfTheWeek;
        if(day == 0){
            dayOfTheWeek = "Sunday";
        }else if(day == 1){
            dayOfTheWeek = "Monday";
        }else if (day == 2){
            dayOfTheWeek = "Tuesday";
        }else if(day == 3){
            dayOfTheWeek = "Wednesday";
        }else if(day == 4){
            dayOfTheWeek = "Thursday";
        }else if(day == 5){
            dayOfTheWeek = "Friday";
        }else if(day == 6){
            dayOfTheWeek = "Saturday";
        }else{
            dayOfTheWeek = "ERROR";
        }

        System.out.println(day + " day of the week is " + dayOfTheWeek);

    }
}
