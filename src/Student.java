public class Student {
    private String fullName = "";
    private String module;
    private int classYear;
    private int age;
    private int studentId;

    //Student class constructor with parameters
    public Student(String fullName, String module, int yearLevel, int age, int studentId) {
        this.fullName = fullName;
        this.module = module;
        this.classYear = yearLevel;
        this.age = age;
        this.studentId = studentId;
    }

    // Create a function to return full name
    public String getFullName() {
        return fullName;
    }

    // Create a function to return module
    public String getModule() {
        return module;
    }

    // Create a function to return year level
    public int getYearLevel() {
        return classYear;
    }

    // function to return age
    public int getAge() {
        return age;
    }

    // function to return student id
    public int getStudentId() {
        return studentId;
    }



}