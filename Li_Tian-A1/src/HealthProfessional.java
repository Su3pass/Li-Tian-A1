// The HealthProfessional class serves as a base class for health professionals like GeneralPractitioner and Specialist.
// It contains common attributes that are shared among all health professionals.
public class HealthProfessional {
    // Instance variables to store the basic information about a health professional
    private String id;
    private String name;
    private String bio;
    private String title;
    private String department;
    private String specialty;
    private String scheduleInfo;
    // Default constructor to initialize instance variables to empty strings
    public HealthProfessional() {
        this.id = "";
        this.name = "";
        this.bio = "";
        this.title = "";
        this.department = "";
        this.specialty = "";
        this.scheduleInfo = "";
    }
    // Parameterized constructor to initialize all instance variables with specific values
    public HealthProfessional(String id, String name, String bio, String title, String department, String specialty, String scheduleInfo) {
        this.id = id;
        this.name = name;
        this.bio = bio;
        this.title = title;
        this.department = department;
        this.specialty = specialty;
        this.scheduleInfo = scheduleInfo;
    }
    // Getter method for the id of the health professional
    public String getId() {
        return id;
    }
    // Setter method for the id of the health professional
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getScheduleInfo() {
        return scheduleInfo;
    }

    public void setScheduleInfo(String scheduleInfo) {
        this.scheduleInfo = scheduleInfo;
    }

    // Method to print the details of the health professional
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Bio: " + bio);
        System.out.println("Title: " + title);
        System.out.println("Department: " + department);
        System.out.println("Specialty: " + specialty);
        System.out.println("Schedule Info: " + scheduleInfo);
    }
}
