/*Create a Patient class with the following features:
Static:
○       A static variable hospitalName shared among all patients.
○       A static method getTotalPatients() to count the total patients admitted.
This:
○       Use this to initialize name, age, and ailment in the constructor.
Final:
○       Use a final variable patientID to uniquely identify each patient.
Instanceof:
○       Check if an object is an instance of the Patient class before displaying its details.
 */

 class Patient {
    private String name;
    private int age;
    private String ailment;
    private final int patientID;

    static String hospitalName = "City Hospital";
    private static int totalPatients = 0;

    public Patient(String name, int age, String ailment) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
        this.patientID = totalPatients;
    }

    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("-----------------------------");
        } else {
            System.out.println("Not a valid Patient object!");
        }
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
        System.out.println("=============================");
    }
}

class Q5 {
    public static void main(String[] args) {
        Patient p1 = new Patient("Kartik", 25, "Fever");
        Patient p2 = new Patient("Aman", 30, "Back Pain");

        p1.displayPatientDetails();
        p2.displayPatientDetails();

        Patient.getTotalPatients();
    }
}
