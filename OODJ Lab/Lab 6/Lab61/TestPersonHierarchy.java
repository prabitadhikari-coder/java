public class TestPersonHierarchy {
    public static void main(String[] args) {
        // Test the hierarchy
        System.out.println("=== Person Hierarchy Test ===\n");
        
        // Create dates
        MyDate hiredDate1 = new MyDate(2020, 5, 15);
        MyDate hiredDate2 = new MyDate(2021, 3, 10);
        
        // Test Student
        Student student = new Student("Alice Johnson", "123 College St", 
                                     "555-1234", "alice@university.edu", 
                                     Student.Status.SOPHOMORE);
        System.out.println(student);
        
        // Test Faculty
        Faculty faculty = new Faculty("Dr. Smith", "456 Faculty Ave", 
                                     "555-5678", "smith@university.edu",
                                     "Science Bldg 201", 80000, hiredDate1,
                                     "MWF 10-12", "Professor");
        System.out.println(faculty);
        System.out.println("Office Hours: " + faculty.getOfficeHours());
        
        // Test FullTimeStaff
        FullTimeStaff fullTimeStaff = new FullTimeStaff("Bob Wilson", 
                                                       "789 Office Rd",
                                                       "555-9012", 
                                                       "bob@university.edu",
                                                       "Admin Bldg 101", hiredDate1,
                                                       "Administrator", 60000);
        System.out.println(fullTimeStaff);
        System.out.println("Monthly earnings: $" + fullTimeStaff.calculateEarnings()/12);
        
        // Test PartTimeStaff
        PartTimeStaff partTimeStaff = new PartTimeStaff("Carol Davis", 
                                                        "321 PartTime Ln",
                                                        "555-3456", 
                                                        "carol@university.edu",
                                                        "Library 202", hiredDate2,
                                                        "Librarian Assistant", 
                                                        25.0, 80);
        System.out.println(partTimeStaff);
        System.out.println("Current earnings: $" + partTimeStaff.calculateEarnings());
        
        // Change hours for part-time staff
        System.out.println("\nChanging hours worked to 100...");
        partTimeStaff.setHoursWorked(100);
        System.out.println("Updated earnings: $" + partTimeStaff.calculateEarnings());
        
        // Demonstrate polymorphism
        System.out.println("\n=== Polymorphism Demo ===");
        System.out.println("Using Person references:");
        Person[] people = new Person[4];
        people[0] = student;
        people[1] = faculty;
        people[2] = fullTimeStaff;
        people[3] = partTimeStaff;
        
        for (Person person : people) {
            System.out.println(person);  // Calls appropriate toString()
        }
        
        // Demonstrate Employee-specific methods
        System.out.println("\n=== Employee Details ===");
        Employee[] employees = new Employee[3];
        employees[0] = faculty;
        employees[1] = fullTimeStaff;
        employees[2] = partTimeStaff;
        
        for (Employee emp : employees) {
            System.out.println(emp.getName() + " - Office: " + emp.getOffice() + 
                             ", Hired: " + emp.getDateHired() + 
                             ", Salary: $" + emp.getSalary());
        }
    }
}
