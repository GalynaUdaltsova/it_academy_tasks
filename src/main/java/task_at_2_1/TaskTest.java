package task_at_2_1;

public class TaskTest {
    public static void main(String[] args) {
        System.out.println("Create classes of Men and Women that have common characteristics " +
                "(e.g. height, weight, hair color, etc.). Limit access to variables from outside - " +
                "implement special getters and setters for access.\n" +
                "Define for each class which characteristics may belong to the class and which may " +
                "belong to the class object. Define for each class which behavior is belonging to the " +
                "class and which to the object.\n" +
                "Implement the logic outlined above for each class.\n" +
                "Create a demo class to display the results of creating objects on the screen.\n");

        Woman ivanovaIlona = new Woman("Ilona", "Ivanova", 25, "red", 10);
        Man ivanovIvan = new Man("Ivan", "Ivanov", 30, "KIA", 3000);
        ivanovaIlona.doAction();
        ivanovIvan.doAction();
        ivanovaIlona.updateHolidayStatus(HolidayStatus.SOON);
        Woman.showHolidayStatus();
        System.out.println(ivanovIvan);
        System.out.println(ivanovaIlona);


    }
}
