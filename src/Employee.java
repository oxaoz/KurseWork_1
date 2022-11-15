import java.util.Objects;

public class Employee {
    private String fullName;
    private double salary;
    private int department;
    private int id;
    private static int count = 0;

    public Employee(String fullName, double salary, int department) {
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
        count++;
        id = count;

    }

    public String getFullName() {
        return fullName;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public static int getCount() {
        return count;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        //return id + "." + fullName + ". Зарплата: " + salary + ". Номер отдела: " + department;
        return String.format("%d. %s; Зарплата: %.2f; Номер отдела: %d", id, fullName, salary, department);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (this == null || this.getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary && department == employee.department && Objects.equals(fullName, employee.fullName);
    }
    @Override
    public int hashCode(){
        return Objects.hash(id, fullName, salary, department);
    }

}