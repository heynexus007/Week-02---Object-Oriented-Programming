import java.util.*;
class Hospital {
    private String name;
    // List to store doctors associated with the hospital
    private List<Doctor> doctors; 
    // List to store patients associated with the hospital
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }
    // Method to add a doctor
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }
    // Method to add a patient
    public void addPatient(Patient patient) {
        patients.add(patient);
    }
}

class Doctor {
    private String name;
    private String specialty;
    private List<Patient> patients;
    // Constructor 
    public Doctor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
        this.patients = new ArrayList<>();
    }

    // Method for the doctor to consult a patient
    public void consult(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this);
        System.out.println("Dr. " + name + " \"" + specialty + "\" is consulting with " + patient.getName() + ".");
    }
}

class Patient {
    private String name;
    // List to store doctors treating the patient
    private List<Doctor> doctors;
    // Constructor
    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        // Creating a hospital instance
        Hospital hospital = new Hospital("City Hospital");
        // Creating a doctor instance
        Doctor doctor1 = new Doctor("Annita", "Cardiologist");
        // Creating a patient instance
        Patient patient1 = new Patient("James");

        // Adding the doctor and patient to the hospital
        hospital.addDoctor(doctor1);
        hospital.addPatient(patient1);

        // Doctor consulting the patient
        doctor1.consult(patient1);
    }
}
