package ObjectOrientedDesignPrinciples.ObjectRelationshipsAndCommunication.SelfProblems;

import java.util.ArrayList;
import java.util.List;

public class DoctorClass {
     private String name;
    private List<PatientClass> patients;

    public DoctorClass(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public void consult(PatientClass p) {
        patients.add(p);
        System.out.println("Doctor " + name + " is consulting patient " + p.getName());
    }

    public void showPatients() {
        System.out.println("Patients of Dr. " + name + ":");
        for (PatientClass p : patients) {
            System.out.println(" - " + p.getName());
        }
    }
}
