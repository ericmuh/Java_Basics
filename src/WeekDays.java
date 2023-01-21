class WeekDays {
    public static void main(String args[]) {
        int day = 4;
        String weekdayString="Friday";

        if (day == 1) {
            weekdayString = "Monday";
        } else if (day == 2) {
            weekdayString = "Tuesday";
        } else if (day == 3) {
            weekdayString = "Wednesday";
        } else if (day == 4) {
            weekdayString = "Thursday";
        } else if (day == 5) {
            weekdayString = "Friday";
        } else if (day == 6) {
            weekdayString = "Saturday";
        } else if (day == 7) {
            weekdayString = "Sunday";
        }
        System.out.println("The day of the week is " + weekdayString);
    }
}
