class Patient {
    // Instance Variable
    // Create a static variable hospital name
    private static String hospitalName = "Vendanta Hospital";

    // Create patient name , age and ailment for patient data
    private String patientName;
    private int age;
    private String ailment;

    // Create countPatient for count no. of patient
    private static int countPatient = 0;

    // create a constructor for initilize values
    Patient(String patientName, int age, String ailment) {
        this.patientName = patientName;
        this.age = age;
        this.ailment = ailment;
        countPatient++;
    }

    // function for getting hospital name
    public static String getHospitalName() {
        return hospitalName;
    }

    // function for getNumberOfPatient
    public static int getNumberOfPatient() {
        return countPatient;
    }

    // Display patient deatails
    public void printPatientData() {
        System.out.println("Patient name : " + patientName);
        System.out.println("Patient age : " + age);
        System.out.println("Patient ailment : " + ailment);
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Print hospital name
        System.out.println("Hospital name is : " + Patient.getHospitalName());

        // A object of patient class for 1st patient
        Patient patient1 = new Patient("Steve smith", 35, "Fever");
        // check object is instance of patient class
        if (patient1 instanceof Patient) {
            patient1.printPatientData();
        } else {
            System.out.println("patient1 is not instance of Patient class");
        }

        System.out.println();
        Patient patient2 = new Patient("Travis head", 30, "Jaundice");
        if (patient2 instanceof Patient) {
            patient2.printPatientData();
        } else {
            System.out.println("patient2 is not instance of Patient class");
        }

        // print number of patient in hospital
        System.out.println("Total number of patient in an hospital : " + Patient.getNumberOfPatient());

    }
}
