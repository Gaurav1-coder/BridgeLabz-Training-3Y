package ObjectOrientedDesignPrinciples.ObjectRelationshipsAndCommunication.SelfProblems;

public class HospitalMain {
     public static void main(String[] args) {
        HospitalClass hospital = new HospitalClass("City Hospital");

        DoctorClass d1 = new DoctorClass("Dr. Mehta");
        DoctorClass d2 = new DoctorClass("Dr. Rao");

        PatientClass p1 = new PatientClass("Amit");
        PatientClass p2 = new PatientClass("Riya");

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);

        hospital.showHospital();
    }
}
