public class FullTimeStaff extends Staff {
    private double fixedSalary;
    
    public FullTimeStaff(String name, String address, String phoneNumber,
                        String email, String office, MyDate dateHired,
                        String title, double fixedSalary) {
        super(name, address, phoneNumber, email, office, 0, dateHired, title);
        this.fixedSalary = fixedSalary;
        this.salary = calculateEarnings();
    }
    
    public double getFixedSalary() { return fixedSalary; }
    
    public double calculateEarnings() {
        return fixedSalary;
    }
    
    @Override
    public String toString() {
        return "FullTimeStaff: " + name + " - Title: " + title + 
               " (Annual Salary: $" + fixedSalary + ")";
    }
}