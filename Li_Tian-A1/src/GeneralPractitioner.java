public class GeneralPractitioner extends HealthProfessional {
    private String referralRecord; // Unique instance variable to represent referral records

    // Default constructor
    public GeneralPractitioner() {
        super();
        this.referralRecord = "No records"; // Default value
    }

    // Parameterized constructor to initialize all instance variables
    public GeneralPractitioner(String id, String name, String bio, String title, String department, String specialty, String scheduleInfo, String referralRecord) {
        super(id, name, bio, title, department, specialty, scheduleInfo);
        this.referralRecord = referralRecord;
    }

    // Getter and Setter methods
    public String getReferralRecord() {
        return referralRecord;
    }

    public void setReferralRecord(String referralRecord) {
        this.referralRecord = referralRecord;
    }

    // Method to display detailed information
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
