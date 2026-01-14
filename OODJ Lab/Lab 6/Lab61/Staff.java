public class Staff extends Employee {
    protected String title;
    
    public Staff(String name, String address, String phoneNumber,
                String email, String office, double salary, MyDate dateHired,
                String title) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = title;
    }
    
    public String getTitle() { return title; }
    
    @Override
    public String toString() {
        return "Staff: " + name + " (" + title + ")";
    }
}