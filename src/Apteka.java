public class Apteka {
    private String patient;
    private String medicalProfessional;
    private String hospital;

    // Конструктор
    public Apteka(String patient, String medicalProfessional, String hospital) {
        this.patient = patient;
        this.medicalProfessional = medicalProfessional;
        this.hospital = hospital;
    }

    // Геттеры и сеттеры для patient
    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    // Геттеры и сеттеры для medicalProfessional
    public String getMedicalProfessional() {
        return medicalProfessional;
    }

    public void setMedicalProfessional(String medicalProfessional) {
        this.medicalProfessional = medicalProfessional;
    }

    // Геттеры и сеттеры для hospital
    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
}
