public class Appointment {
    private String patientName;
    private String patientPhone;
    private String preferredTimeSlot;
    private HealthProfessional selectedDoctor; // Can be GeneralPractitioner or Specialist

    public Appointment() {
        this.patientName = "";
        this.patientPhone = "";
        this.preferredTimeSlot = "";
        this.selectedDoctor = null;
    }

    public Appointment(String patientName, String patientPhone, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.preferredTimeSlot = preferredTimeSlot;
        this.selectedDoctor = selectedDoctor;
    }
    
    public void printAppointmentDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Phone: " + patientPhone);
        System.out.println("Preferred Time Slot: " + preferredTimeSlot);
        System.out.println("Selected Doctor:");
        if (selectedDoctor != null) {
            selectedDoctor.printDetails();
            //Assuming printDetails() method exists in HealthProfessional
            //Even if the reference type of selectedDoctor is HealthProfessional,
            //Java will dynamically bind and call the corresponding printDetailes() method based on the actual class type I create (I create GeneralPractitioner or Specialist subclasses).
            //This is precisely a manifestation of polymorphism
        } else {
            System.out.println("No doctor selected");
        }
    }
}
