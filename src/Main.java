
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Register register = new Register();
        register.add(new Student("John Doe", "Math", 1, 18, 1),
                new Student("Bane Done", "English", 1, 19, 2),
                new Student("Jane Dane", "Science", 1, 20, 3),
                new Student("Dane Dane", "History", 1, 21, 4),
                new Student("Jane Doe", "Math", 1, 22, 5),
                new Student("John Dane", "English", 1, 23, 6)
        );





      printStudents(register);
    }


    public static void printStudents(Register register) {
        register.getStudents().forEach(student -> System.out.println(student.getFullName()));
    }


    public static void addStudent(Register register, Student student) {
        register.add(student);
    }

    public void removeStudentByID(Register register, int id) {
        register.getStudents().removeIf(student -> student.getStudentId() == id);
    }

    public void getStudentById(Register register, int id) {
        register.getStudents().stream().filter(student -> student.getStudentId() == id).forEach(student -> System.out.println(student.getFullName()));
    }


    public void getStudentsByModule(Register register, String module) {
        register.getStudents().stream().filter(student -> student.getModule().equals(module)).forEach(student -> System.out.println(student.getFullName()));
    }

}