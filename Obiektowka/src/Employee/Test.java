package Employee;

/**
 * Created by machu on 2017-04-02.
 */
public class Test {

    public static void main(String[] args) {
        Company company = new Company("Nowaa");
        company.addEmployee(new Employee("Michal", "M",10));
        company.addEmployee(new Employee("Pawel", "W",30));
        company.listAllEmployess();
    }
}
