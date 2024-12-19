public class Main {
    public static void main(String[] args) {
        // Создаем объекты Apteka
        Apteka record1 = new Apteka("John Doe", "Dr. Smith", "Central City Hospital");
        Apteka record2 = new Apteka("Jane Doe", "Dr. Adams", "Westside Hospital");

        // Выводим информацию о записях
        System.out.println(record1.getPatient() + " | "
                + record1.getMedicalProfessional() + " | "
                + record1.getHospital());

        System.out.println(record2.getPatient() + " | "
                + record2.getMedicalProfessional() + " | "
                + record2.getHospital());
    }
}
