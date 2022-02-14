class Person {
    String name;

    Person() {
        name = "";
    }

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Person Name : " + name);
    }
}

class Employee extends Person {
    double salary;
    int yearOfJoining;
    String uan;

    Employee() {
        super();
        this.salary = 0;
        yearOfJoining = 0;
        uan = "";
    }

    Employee(String name) {
        super(name);
    }

    Employee(String name, double salary) {
        this();
        this.name = name;
        this.salary = salary;
    }

    Employee(String name, double salary, int yearOfJoining) {
        this(name, salary);
        this.yearOfJoining = yearOfJoining;
    }

    Employee(String name, double salary, int yearOfJoining, String uan) {
        this(name, salary, yearOfJoining);
        this.uan = uan;
    }

    Employee(Employee e) {
        this.name = e.name;
        this.salary = e.salary;
        this.yearOfJoining = e.yearOfJoining;
        this.uan = e.uan;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public String getUan() {
        return uan;
    }

    public void setUan(String uan) {
        this.uan = uan;
    }

    @Override
    void display() {
        System.out.printf("Name : %s %nSalary : %.2f %nYearOfJoining : %d %nUAN : %s%n%n", this.name, this.salary,
                this.yearOfJoining, this.uan);
    }

    boolean isEqual(Employee e) {
        return (this.name.equals(e.name) && this.uan.equals(e.uan) && this.yearOfJoining == e.yearOfJoining);
    }

    boolean isEqual(Person p) {
        return (this.name.equals(p.name));
    }
}

public class EmployeeDriver {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Bheru", 1200.00);
        Person p1 = new Person();
        e1.setName("Yusuf");
        e1.setUan("129834577962");
        e1.display();
        e2.display();
        p1.display();
        System.out.println("Checking for e1 = e2 : " + e1.isEqual(e2));
        System.out.println("Checking for e1 = p : " + e1.isEqual(p1));
        Employee e3 = new Employee(e1);
        System.out.println("Checking for e1 = e3 : " + e1.isEqual(e3));

    }
}
