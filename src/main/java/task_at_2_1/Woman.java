package task_at_2_1;

public class Woman extends Human {
    public static final String WOMAN_DAY_DATE = "8th of March";

    private static HolidayStatus holidayStatus;
    private String lipstickColor;
    private int BagsCount;

    public Woman(String firstName, String lastName, int age, String lipstickColor, int bagsCount) {
        super(firstName, lastName, age, Gender.FEMALE);
        this.lipstickColor = lipstickColor;
        BagsCount = bagsCount;
    }

    @Override
    public void doAction() {
        System.out.println("Painting the lips into " + this.lipstickColor + " color...");
    }

    public static void updateHolidayStatus(HolidayStatus newHolidayStatus) {
        if (newHolidayStatus == null){
            throw new IllegalArgumentException("Holiday status can not be null");
        }
        holidayStatus = newHolidayStatus;
    }

    public void showHolidayStatus() {
        System.out.println(holidayStatus + " " + WOMAN_DAY_DATE);
    }

    public String getLipstickColor() {
        return lipstickColor;
    }

    public void setLipstickColor(String lipstickColor) {
        this.lipstickColor = lipstickColor;
    }

    public int getBagsCount() {
        return BagsCount;
    }

    public void setBagsCount(int bagsCount) {
        BagsCount = bagsCount;
    }

    @Override
    public String toString() {
        return "Woman{" +
                "lipstickColor='" + lipstickColor + '\'' +
                ", BagsCount=" + BagsCount +
                '}';
    }
}
