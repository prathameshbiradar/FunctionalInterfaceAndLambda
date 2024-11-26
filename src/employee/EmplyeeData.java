package employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmplyeeData {
    public static List<Employee> emp =
            Arrays.asList(new Employee("Nagesh",1,10000),
                    new Employee("Akshay",2,12222),
                    new Employee("Om",3,8000),
                    new Employee("Yash",4,8000),
                    new Employee("Aditya",5,13000)
            );

    public static List<Employee> getEmployees()
    {
        return new ArrayList<>(emp);
    }
}
