public class PartTimeStaff extends Staff {
    private double hourlyRate;
    private int hoursWorked;
    
    public PartTimeStaff(String name, String address, String phoneNumber,
                        String email, String office, MyDate dateHired,
                        String title, double hourlyRate, int hoursWorked) {
        super(name, address, phoneNumber, email, office, 0, dateHired, title);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.salary = calculateEarnings();
    }
    
    public double getHourlyRate() { return hourlyRate; }
    public int getHoursWorked() { return hoursWorked; }
    
    public double calculateEarnings() {
        return hourlyRate * hoursWorked;
    }
    
    public void setHoursWorked(int hours) {
        this.hoursWorked = hours;
        this.salary = calculateEarnings();
    }
    
    @Override
    public String toString() {
        return "PartTimeStaff: " + name + " - Title: " + title + 
               " (Earnings: $" + calculateEarnings() + " at $" + 
               hourlyRate + "/hour for " + hoursWorked + " hours)";
    }
}