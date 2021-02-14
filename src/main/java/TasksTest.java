import task_at_2_1.Gender;
import task_at_2_1.HolidayStatus;
import task_at_2_1.Man;
import task_at_2_1.Woman;

public class TasksTest {
    public static void main(String[] args) {
//        ArrayOperator.fillArrayWithData();
//        TextOperator.calculateTheAverageLengthOfLines();
//        NumberOperator.executeMathematicalOperations();
//        OperationExecutor.executeOperation();

        Woman woman = new Woman("Ilona", "Ivanova", 25, "red", 10);
        Man man = new Man("Ivan", "Ivanov", 30, "KIA", 3000);
        woman.doAction();
        man.doAction();
        Woman.updateHolidayStatus(HolidayStatus.SOON);
        woman.showHolidayStatus();




    }
}
