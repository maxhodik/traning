package student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Sergey", "ivanov", "lm 13", 5);
        Student student2 = new Student("alex", "petrov", "la 12", 4.6);
        Student student3 = new Student("Anna", "sidorova", "ls 12", 3.5);
        Aspirant aspirant1 = new Aspirant("Timofey", "godik", "if 22", 5.0, "develop PO");
        Student aspirant2 = new Aspirant("Maha", "Kasha", "ju 34", 4.5, "work34");
        Student[] students = {student1, student2, student3, aspirant1, aspirant2};
        Aspirant[] aspirants = { aspirant1, (Aspirant) aspirant2 };


        for (Student student : students) {
            student.getScholarship();
        }
        for (Aspirant student : aspirants) {
            student.getScholarship();
        }
    }
}
