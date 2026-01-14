public class Employee extends Person {
    protected String office;
    protected double salary;
    protected MyDate dateHired;
    
    public Employee(String name, String address, String phoneNumber,
                   String email, String office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }
    
    public String getOffice() { return office; }
    public double getSalary() { return salary; }
    public MyDate getDateHired() { return dateHired; }
    
    @Override
    public String toString() {
        return "Employee: " + name;
    }
}