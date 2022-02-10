package push_up_dependency;

public class WeekService {

    private final TimeService timeService = new TimeService();

    public void printWeekend() {
        int dayOfWeek = timeService.getDayOfWeek();
        if (dayOfWeek == 6 || dayOfWeek == 7) {
            System.out.println("weekend");
        }
    }

    private static class TimeService {
        public int getDayOfWeek() {
            return 6;
        }
    }
}
