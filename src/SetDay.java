public class SetDay {
    final static int SUN = 0;
    final static int MON = 1;
    final static int TUE = 2;
    final static int WED = 3;
    final static int THU = 4;
    final static int FRI = 5;
    final static int SAT = 6;

    public static void main(String[] args) {

        Day outDay = new Day(THU);
        System.out.print("The current day: " + outDay);
        System.out.println();
        outDay.setDay(outDay.previousDay());
        System.out.print("The previous day: " + outDay);
        System.out.println();
        outDay.setDay(outDay.followingDay());
        outDay.setDay(outDay.followingDay());
        System.out.print("The next day: " + outDay);
        System.out.println();
        outDay.setDay(outDay.futureDay(10));
        System.out.print("10 days later: " + outDay);
        System.out.println();
    }
}
