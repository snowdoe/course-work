package Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by machu on 2017-04-02.
 */
public class Company {
    private List<Employee> employeeList;
    private String name;


    public Company(String name) {
        this.name = name;
        employeeList = new ArrayList<Employee>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }
    public void addEmployee (){

        String name;
        String surname;
        int age;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie nowego pracownika: ");
        name = scanner.nextLine();
        System.out.println("Podaj nazwisko nowego pracownika: ");
        surname = scanner.nextLine();
        System.out.println("Podaj wiek nowego pracownika: ");
        age = scanner.nextInt();
        employeeList.add(new Employee(name,surname,age));


    }
    public void listAllEmployess(){
        employeeList.forEach(e->System.out.println(e.show()));
    }

    public String getName() {
        return name;
    }
}
