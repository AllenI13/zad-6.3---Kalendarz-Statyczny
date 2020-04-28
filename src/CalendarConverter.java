public class CalendarConverter {
    private final static int monday = 1;
    private final static int tuesday = 2;
    private final static int wednesday = 3;
    private final static int thursday = 4;
    private final static int friday = 5;
    private final static int saturday = 6;
    private final static int sunday = 7;

    String convertDayToString(int dayNumber) {
        switch (dayNumber) {
            case monday:
                System.out.println("Monday");
                break;
            case tuesday:
                System.out.println("Tuesday");
                break;
            case wednesday:
                System.out.println("Wednesday");
                break;
            case thursday:
                System.out.println("Thursday");
                break;
            case friday:
                System.out.println("Friday");
                break;
            case saturday:
                System.out.println("Saturday");
                break;
            case sunday:
                System.out.println("Sunday");
                break;
        }
        return null;
    }
}