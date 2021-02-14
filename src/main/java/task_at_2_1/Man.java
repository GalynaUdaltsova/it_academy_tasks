package task_at_2_1;

public class Man extends Human {
    private String car;
    private double salary;

    public Man(String firstName, String lastName, int age, String car, double salary) {
        super(firstName, lastName, age, Gender.MALE);
        this.car = car;
        this.salary = salary;
    }

    @Override
    public void doAction() {
        System.out.println("I drive a car: " + this.car);
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Man{" +
                "car='" + car + '\'' +
                ", salary=" + salary +
                '}';
    }
}
