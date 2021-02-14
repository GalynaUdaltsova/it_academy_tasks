package task_at_2_1;

public class Woman extends Human {
    private static final String WOMAN_DAY_DATE = "8th of March";

    private static HolidayStatus holidayStatus;
    private String lipstickColor;
    private int bagsCount;

    public Woman(String firstName, String lastName, int age, String lipstickColor, int bagsCount) {
        super(firstName, lastName, age);
        this.lipstickColor = lipstickColor;
        this.bagsCount = bagsCount;
    }

    @Override
    public void doAction() {
        System.out.println("The woman is painting lips " + this.lipstickColor + " color...");
    }

    public static void updateHolidayStatus(HolidayStatus newHolidayStatus) {
        if (newHolidayStatus == null){
            throw new IllegalArgumentException("Holiday status can not be null");
        }
        holidayStatus = newHolidayStatus;
    }

    public void showHolidayStatus() {
        System.out.println(holidayStatus + " holiday: " + WOMAN_DAY_DATE);
    }

    public String getLipstickColor() {
        return lipstickColor;
    }

    public void setLipstickColor(String lipstickColor) {
        this.lipstickColor = lipstickColor;
    }

    public int getBagsCount() {
        return bagsCount;
    }

    public void setBagsCount(int bagsCount) {
        this.bagsCount = bagsCount;
    }

    @Override
    public String toString() {
        return "Woman{" +
                "firstName='" + super.firstName + '\'' +
                ", lastName='" + super.lastName + '\'' +
                ", age=" + super.age + '\'' +
                ", lipstickColor='" + lipstickColor + '\'' +
                ", BagsCount=" + bagsCount +
                '}';
    }
}
