package push_down_sideeffect;

public class WeekService {

    private final Printer printer;

    public WeekService(Printer printer) {
        this.printer = printer;
    }

    public static void main(String... args) {
        Printer printer = new Printer();
        WeekService service = new WeekService(printer);
        service.printWeekend(6);
    }

    public void printWeekend(int dayOfWeek) {
        if (dayOfWeek == 6 || dayOfWeek == 7) {
            printer.print("weekend");
        }
    }

    public static class Printer {
        public Printer() {
        }

        void print(String weekend) {
            System.out.print(weekend);
        }
    }
}
