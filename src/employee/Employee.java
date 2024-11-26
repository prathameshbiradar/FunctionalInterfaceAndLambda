package employee;

public class Employee {
    private String name;
    private int id;
    private long salary;

    public String getName(){
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public long getSalary(){
        return salary;
    }
    public void setSalary(int salary)
    {
        this.salary=salary;
    }
    public Employee(String name,int id,long salary)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public String toString()
    {
        return name+" "+id+" "+salary;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj==null || getClass() !=obj.getClass()) return false;

        Employee emp = (Employee) obj;
        return  salary == emp.salary && id == emp.id && name==emp.getName();

    }
}
