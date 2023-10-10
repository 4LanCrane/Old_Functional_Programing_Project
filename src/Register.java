import java.util.ArrayList;
import java.util.Collections;

public class Register {
    //an ArrayList of Student objects with name, module, yearLevel, and age and student id  as parameters
    private ArrayList<Student> students = new ArrayList<Student>();

//method to get the ArrayList
    public void add(Student ... studentsInput) {
        Collections.addAll(students, studentsInput);
    }



    public ArrayList<Student> getStudents() {
        return students;
    }

    //a method to return all students into a copy of the ArrayList
    public ArrayList<Student> getAllStudentsCopy() {
        ArrayList<Student> copy = new ArrayList<Student>(students);
        return copy;
    }

    //a method to remove a student from the ArrayList
    public void removeStudent(Student student) {
        students.remove(student);
    }




}