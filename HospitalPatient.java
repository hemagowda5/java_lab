class Patient {

    String name;
    String diagnosis;

    Patient(String name, String diagnosis) {
        this.name = name;
        this.diagnosis = diagnosis;
    }
}

public class HospitalPatient {

    static void updateDiagnosis(Patient p) {
        p.diagnosis = "Typhoid";
    }

    public static void main(String[] args) {

        Patient p1 = new Patient("Rahul", "Fever");

        System.out.println("Before Update:");
        System.out.println("Name      : " + p1.name);
        System.out.println("Diagnosis : " + p1.diagnosis);

        updateDiagnosis(p1);

        System.out.println("\nAfter Update:");
        System.out.println("Name      : " + p1.name);
        System.out.println("Diagnosis : " + p1.diagnosis);
    }
}
