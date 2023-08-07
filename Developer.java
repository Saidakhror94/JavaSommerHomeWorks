package Hwsommerr;

public class Developer {
    private String firstName;
    private String lastName;
    private int salary;
    private char gender;
    private Car car;


    @Override
    public String toString() {
        return "\nDeveloper{" +
                "\nfirstName: " + firstName +
                "\nlastName:  " + lastName +
                "\nsalary:    " + salary +
                "\ngender:    " + gender +
                "\ncar:       " + car +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Developer(String firstName, String lastName, int salary, char gender, Car car) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.gender = gender;
        this.car = car;


    }
}
