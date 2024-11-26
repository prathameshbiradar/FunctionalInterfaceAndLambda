package employee;

import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {

       List<Employee> employees = EmplyeeData.getEmployees();

        System.out.println("Emplyee List");
        for(Employee e: employees)
        {
            System.out.println(e);
        }
      employees.sort(new Comparator<Employee>() {
          @Override
          public int compare(Employee o1, Employee o2) {
              return Long.compare(o1.getSalary(),o2.getSalary());
          }
      });
        System.out.println("Emplyee List after sort");
        for(Employee e: employees)
        {
            System.out.println(e);
        }

//        employees.sort(Comparator.comparingLong(Employee::getSalary));

    }
}