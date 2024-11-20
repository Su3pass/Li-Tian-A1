public class AssignmentOne {
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
    }
}