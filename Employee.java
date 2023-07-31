public class Employee {
    private String ID;
    private String name;
    private int salary;

    public Employee(String ID, String name, int salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }
    public String getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }
    public int getAnnualSalary() {
        return salary * 12;
    }
    public int raisedSalary(int perecent) {
        int raised = salary * perecent / 100; // 800
        salary = salary + raised; // 2000 + 800
        return salary;
    }
    public String toString() {
        return "Employee ID: " + ID + "\nEmployee Name: " + name + "\nEmployee Salary: " + salary;
    }
    public static void main(String[] args) {
        Employee employee = new Employee("441850197", "Sawsan Tamim", 20000);
        //System.out.println("Employee ID: " + employee.getID());
        //System.out.println("Employee Name: " + employee.getName());
        //System.out.println("Employee Salary: " + employee.getSalary());
        //System.out.println(employee);
        System.out.println(employee.toString());
        System.out.println("Annual Salary: " + employee.getAnnualSalary());
        employee.raisedSalary(40);
        System.out.println("Amount of raised of employee: " + employee.getSalary());
        //System.out.println("Amount of raised of employee: " + employee.raisedSalary(40));
    }
}