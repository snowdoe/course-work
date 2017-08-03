package Employee;

/**
 * Created by machu on 2017-04-02.
 */
public class Employee implements Showable {

    private String name;
    private String surname;
    private int age;

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String show() {
        return (name + " " + surname + ", age: " + age);
    }
}
