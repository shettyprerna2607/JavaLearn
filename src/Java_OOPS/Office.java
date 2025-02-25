package Java_OOPS;

class Employee {
    int Salary;
    String name;

    int getSalary() { // Removed parameter
        return Salary;
    }

    void setSalary(int Salary) { // Added setter for salary
        this.Salary = Salary;
    }

    String getName() { // Removed parameter
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}

public class Office {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Prerana");
        employee.setSalary(500000);

        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Salary: " + employee.getSalary());
    }
}

