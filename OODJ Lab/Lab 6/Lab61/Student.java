public class Student extends Person {
    public enum Status {
        FRESHMAN, SOPHOMORE, JUNIOR, SENIOR
    }
    
    private Status status;
    
    public Student(String name, String address, String phoneNumber, 
                  String email, Status status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }
    
    public Status getStatus() { return status; }
    
    @Override
    public String toString() {
        return "Student: " + name + " (" + status + ")";
    }
}