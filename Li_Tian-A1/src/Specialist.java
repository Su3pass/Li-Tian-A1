// The Specialist class extends HealthProfessional and represents a specific type of health professional: a specialist.
public class Specialist extends HealthProfessional {

    // Unique instance variable to represent the area of specialization for the specialist
    private String specializationArea; // Unique instance variable to differentiate other health professionals
    // Instance variable to represent the patient limit for the specialist
    private int patientLimit; // New attribute to represent patient limit for specialists
    // Default constructor: Initializes the specialist with default values and calls the parent class constructor
    public Specialist() {
        super();
        this.specializationArea = "Unknown"; // Default value
        this.patientLimit = 0; // Default value
    }

    // Parameterized constructor: Initializes the specialist's information, including specialization area and patient limit
    public Specialist(String id, String name, String bio, String title, String department, String specialty, String scheduleInfo, String specializationArea, int patientLimit) {
        super(id, name, bio, title, department, specialty, scheduleInfo);
        this.specializationArea = specializationArea;
        this.patientLimit = patientLimit;
    }

    // Getter method to return the specialization area of the specialist
    public String getSpecializationArea() {
        return specializationArea;
    }
    // Setter method to update the specialization area
    public void setSpecializationArea(String specializationArea) {
        this.specializationArea = specializationArea;
    }
    // Getter method to return the patient limit of the specialist
    public int getPatientLimit() {
        return patientLimit;
    }
    // Setter method to update the patient limit
    public void setPatientLimit(int patientLimit) {
        this.patientLimit = patientLimit;
    }
    // Overridden method to print details of the specialist, including specialization area and patient limit
    @Override
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
