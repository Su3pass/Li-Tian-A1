// The GeneralPractitioner class extends HealthProfessional and represents a specific type of health professional: a general practitioner.
public class GeneralPractitioner extends HealthProfessional {
    // Unique instance variable to represent referral records for the general practitioner
    private String referralRecord; // Unique instance variable to represent referral records

    // Default constructor: Initializes the general practitioner with default values and calls the parent class constructor
    public GeneralPractitioner() {
        super();
        this.referralRecord = "No records"; // Default value
    }

    // Parameterized constructor: Initializes the general practitioner's information and referral record
    public GeneralPractitioner(String id, String name, String bio, String title, String department, String specialty, String scheduleInfo, String referralRecord) {
        super(id, name, bio, title, department, specialty, scheduleInfo);
        this.referralRecord = referralRecord;
    }

    // Getter method to return the referral record
    public String getReferralRecord() {
        return referralRecord;
    }
    // Setter method to update the referral record
    public void setReferralRecord(String referralRecord) {
        this.referralRecord = referralRecord;
    }
    // Overridden method to print details of the general practitioner, including the referral record
    @Override
    public void printDetails() {
        System.out.println("Health Professional Type: General Practitioner");
        System.out.println("Health Professional Details:");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Bio: " + getBio());
        System.out.println("Title: " + getTitle());
        System.out.println("Department: " + getDepartment());
        System.out.println("Specialty: " + getSpecialty());
        System.out.println("Schedule Info: " + getScheduleInfo());
        System.out.println("Referral Record: " + referralRecord);
    }

}
