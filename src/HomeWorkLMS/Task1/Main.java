package HomeWorkLMS.Task1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        EducationCenter school = new School("84", "Kyrgyzstan", LocalDate.of(2003, 12,9));
        EducationCenter college = new College("Politech", "Moskow", LocalDate.of(2003, 04,05));
        EducationCenter university = new University("KTMU", "Kyrgyzstan", LocalDate.of(2005, 8,9));

        Student student1 = new Student("Aigerim", "Akylbekova", 'F', LocalDate.of(2010, 9, 9), school);
        Student student2 = new Student("Arlan", "Kalikov", 'M', LocalDate.of(2003, 9, 12), college);
        Student student3 = new Student("Kalybek", "Paratov", 'M', LocalDate.of(2003, 6,9),university);

        System.out.println("Fisrt student:\n" + "date of start: "+ student1.getDateOfStart());
        System.out.println("Education center: " + student1.getEducationCenter());

        System.out.println("Second student:\n" + "date of start: "+student2.getDateOfStart());
        System.out.println("Education center: " + student2.getEducationCenter());

        System.out.println("Third student:\n" + "date of start: "+student3.getDateOfStart());
        System.out.println("Education center: " + student3.getEducationCenter());

    }
}
