public class NumberOfDaysInMonth14 {

    public static boolean isLeapYear(int year) {

        if(year < 1 || year > 9999){
            return false;
        }

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return true;
        }

        return false;

    }

    public static int getDaysInMonth(int month, int year) {

        if (month < 1 || month > 12) {
            return -1;
        }
        if(year < 1 || year > 9999){
            return -1;
        }

        switch(month){
            case 1, 3, 5, 7, 8, 10, 12 -> {
                return 31;
            }
            case 2 -> {
                if(!isLeapYear(year)){
                    return 28;
                }else{
                    return 29;
                }
            }
            case 4, 6, 9, 11 -> {
                return 30;
            }

            default -> {
                return -1;
            }
        }

    }

}
