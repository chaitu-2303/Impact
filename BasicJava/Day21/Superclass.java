class Employee 
{
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) 
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() 
    {
        return salary;
    }

    public int getId() 
    {
        return id;
    }

    public String getName() 
    {
        return name;
    }

    public void printEmployeeDetails() 
    {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee 
{
    double bonus;

    public Manager(int id, String name, double salary, double bonus) 
    {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public double calculateSalary() 
    {
        return salary + bonus;
    }

    public double getBonus() 
    {
        return bonus;
    }

    public void printManagerDetails() 
    {
        System.out.println("Manager Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

class Developer extends Employee 
{
    double overtime;

    public Developer(int id, String name, double salary, double overtime) 
    {
        super(id, name, salary);
        this.overtime = overtime;
    }

    public double calculateSalary() 
    {
        return salary + overtime;
    }

    public double getOvertime() 
    {
        return overtime;
    }

    public void printDeveloperDetails() 
    {
        System.out.println("Developer Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Overtime: " + overtime);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

public class Superclass 
{
    public static void main(String[] args) 
    {
        Manager manager = new Manager(2004, "Chaitanya", 10000000, 5000000);
        Developer developer = new Developer(2003, "Sai", 5000000, 500000);
        Employee employee = new Employee(2005, "Mohan", 300000);

        System.out.println(" ");
        manager.printManagerDetails();
        System.out.println();

        System.out.println(" ");
        developer.printDeveloperDetails();
        System.out.println();

        System.out.println(" ");
        employee.printEmployeeDetails();
    }
}
