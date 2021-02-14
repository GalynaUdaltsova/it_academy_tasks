package task_at_2_1;

public abstract class Human {
    private String FirstName;
    private String lastName;
    private int age;
    private Gender gender;

    public Human(String firstName, String lastName, int age, Gender gender) {
        FirstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public abstract void doAction();

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Human{" +
                "FirstName='" + FirstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
