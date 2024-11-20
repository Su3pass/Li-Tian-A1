import java.util.ArrayList;
public class AssignmentOne {
    // Part 5 – Collection of appointments
    private static ArrayList<Appointment> patient_appointments = new ArrayList<>();

    public static void main(String[] args) {

        // Part 3 – Using classes and objects
        GeneralPractitioner GP_1 = new GeneralPractitioner("1011", "Dr. John Wick", "Experienced surgeon", "Senior Doctor", "General Medicine", "General health", "8 AM - 12 PM", "NULL");
        GeneralPractitioner GP_2 = new GeneralPractitioner("7202", "Dr. Alice Mobley", "Family health expert", "General Practitioner", "General Medicine", "General health", "12 AM - 6PM", "NULL");
        GeneralPractitioner GP_3 = new GeneralPractitioner("4032", "Dr. Mark Curry", "Rural health specialist", "General Practitioner", "General Medicine", "General health", "6 PM - 10 PM", "NULL");

        Specialist SP_1 = new Specialist("1014", "Dr. Kobe White", "Dermatology expert", "Dermatologist", "Dermatology", "Skin diseases", "8 AM - 9 PM", "Dermatological Surgery", 20);
        Specialist SP_2 = new Specialist("9821", "Dr. Evan Green", "ENT specialist", "Otolaryngologist", "ENT (Ear, Nose, and Throat)", "Ear, Nose, and Throat treatment", "12 AM - 12 PM", "ENT Surgery", 15);

        System.out.println("------------------------------------------");
        GP_1.printDetails();
        System.out.println("------------------------------------------");
        GP_2.printDetails();
        System.out.println("------------------------------------------");
        GP_3.printDetails();
        System.out.println("------------------------------------------");
        SP_1.printDetails();
        System.out.println("------------------------------------------");
        SP_2.printDetails();
        System.out.println("------------------------------------------");

        // Part 5 – Collection of appointments

        //Make 2 appointments with general practitioners.
        createAppointment("Lebron Brown", "323-436-5890", "9:00 AM", GP_1);
        createAppointment("Keven Smith", "937-654-2510", "2:00 PM", GP_2);
        //Make another 2 appointments with the other type of health professional.
        createAppointment("Peter Johnson", "555-213-5537", "10:00 AM", SP_1);
        createAppointment("AJ White", "351-634-9820", "3:00 PM", SP_2);
        System.out.println("------------------------------------------");

        // Print existing appointments
        System.out.println("Printing existing appointments:");
        System.out.println("------------------------------------------");
        printExistingAppointments();

        System.out.println("------------------------------------------");

        // Cancel one of the existing appointments.
        cancelBooking("555-213-5537");
        System.out.println("------------------------------------------");

        // Print again existing appointments to demonstrate the updated collection of appointments.
        System.out.println("Printing appointments after cancellation:");
        System.out.println("------------------------------------------");
        printExistingAppointments();
        System.out.println("------------------------------------------");
    }

    // Method to create a new appointment
    public static void createAppointment(String patientName, String patientPhone, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        if (patientName != null && !patientName.isEmpty() && patientPhone != null && !patientPhone.isEmpty() && preferredTimeSlot != null && !preferredTimeSlot.isEmpty() && selectedDoctor != null) {
            patient_appointments.add(new Appointment(patientName, patientPhone, preferredTimeSlot, selectedDoctor));
            System.out.println("Appointment created for: " + patientName);
        } else {
            System.out.println("Error: All required information must be provided to create an appointment.");
        }
    }

    // Method to print existing appointments
    public static void printExistingAppointments() {
        if (patient_appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            for (Appointment appointment : patient_appointments) {
                appointment.printAppointmentDetails();
                System.out.println("------------------------------------------");
            }
        }
    }

    // Method to cancel a booking using the patient's mobile phone
    public static void cancelBooking(String patientPhone) {
        boolean found = false;
        for (int i = 0; i < patient_appointments.size(); i++) {
            if (patient_appointments.get(i).getpatientPhone().equals(patientPhone)) {
                patient_appointments.remove(i);
                System.out.println("Appointment cancelled for phone: " + patientPhone);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Error: No appointment found for phone: " + patientPhone);
        }
    }

}