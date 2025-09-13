package ObjectOrientedDesignPrinciples.ObjectRelationshipsAndCommunication.SelfProblems;

import java.util.ArrayList;
import java.util.List;

public class HospitalClass {
    private String name;
    private List<DoctorClass> doctors;

    public HospitalClass(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public void addDoctor(DoctorClass d) {
        doctors.add(d);
    }

    public void showHospital() {
        System.out.println("Hospital: " + name);
        for (DoctorClass d : doctors) {
            d.showPatients();
        }
    }
}
