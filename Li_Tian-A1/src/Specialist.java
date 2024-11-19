public class Specialist extends HealthProfessional {
    private String specializationArea; // Unique instance variable to differentiate other health professionals
    private int patientLimit; // New attribute to represent patient limit for specialists

    // Default constructor
    public Specialist() {
        super();
        this.specializationArea = "Unknown"; // Default value
        this.patientLimit = 0; // Default value
    }

    // Parameterized constructor to initialize all instance variables
    public Specialist(String id, String name, String bio, String title, String department, String specialty, String scheduleInfo, String specializationArea, int patientLimit) {
        super(id, name, bio, title, department, specialty, scheduleInfo);
        this.specializationArea = specializationArea;
        this.patientLimit = patientLimit;
    }

    // Getter and Setter methods
    public String getSpecializationArea() {
        return specializationArea;
    }

    public void setSpecializationArea(String specializationArea) {
        this.specializationArea = specializationArea;
    }

    public int getPatientLimit() {
        return patientLimit;
    }

    public void setPatientLimit(int patientLimit) {
        this.patientLimit = patientLimit;
    }

    // Method to display detailed information
    public void printDetails() {
        System.out.println("Health Professional Type: Specialist");
        System.out.println("Health Professional Details:");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Bio: " + getBio());
        System.out.println("Title: " + getTitle());
        System.out.println("Department: " + getDepartment());
        System.out.println("Specialty: " + getSpecialty());
        System.out.println("Schedule Info: " + getScheduleInfo());
        System.out.println("Specialization Area: " + specializationArea);
        System.out.println("Patient Limit: " + patientLimit);
    }
}
