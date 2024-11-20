public class GeneralPractitioner extends HealthProfessional {
    private String referralRecord; // Unique instance variable to represent referral records


    public GeneralPractitioner() {
        super();
        this.referralRecord = "No records"; // Default value
    }


    public GeneralPractitioner(String id, String name, String bio, String title, String department, String specialty, String scheduleInfo, String referralRecord) {
        super(id, name, bio, title, department, specialty, scheduleInfo);
        this.referralRecord = referralRecord;
    }


    public String getReferralRecord() {
        return referralRecord;
    }

    public void setReferralRecord(String referralRecord) {
        this.referralRecord = referralRecord;
    }

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
