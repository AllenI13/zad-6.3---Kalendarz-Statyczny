public class ConverterTest {
    public static void main(String[] args) {
        CalendarConverter calendarConverter = new CalendarConverter();
        for(int i=0; i<=7; i++){
            calendarConverter.convertDayToString(i);
        }
    }
}
