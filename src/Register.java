import java.util.ArrayList;
import java.util.Collections;

public class Register {
    //an ArrayList of Student objects with name, module, yearLevel, and age and student id  as parameters
    private ArrayList<Student> students = new ArrayList<Student>();

//method to get the ArrayList
    //a collection to add students multiple student object to the students ArrayList
    public void add(Student ... studentsInput) {
        Collections.addAll(students, studentsInput);
    }



//a function that removes a student by their id
    public void removeStudentByID(int id) {
        students.removeIf(student -> student.getStudentId() == id);
    }

    //a function that get all students of a certain module
    public ArrayList<Student> getStudentsByModule(String module) {
        ArrayList<Student> studentsByModule = new ArrayList<Student>();
        students.stream().filter(student -> student.getModule().equals(module)).forEach(studentsByModule::add);
        return studentsByModule;
    }


    // a method that uses functional programming to return a list of all students, their module, and their year level,age and student id
    public void allStudents() {
        students.forEach(student -> System.out.println(student.getFullName() + " " + student.getModule() + " " + student.getYearLevel() + " " + student.getAge() + " " + student.getStudentId()));
    }


    //a function that returns a student by their id
    public Student getStudentById(int id) {
        return students.stream().filter(student -> student.getStudentId() == id).findFirst().orElse(null);
    }


// a function that add a student and allows input
    public void addStudent(String fullName, String module, int yearLevel, int age, int studentId) {
        students.add(new Student(fullName, module, yearLevel, age, studentId));
    }

    //a function that returns a list of all students, their module, and their year level,age and student id
    public ArrayList<Student> getStudents() {
        return students;
    }








}