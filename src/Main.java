
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Register register = new Register();
        register.add(new Student("John Doe", "Math", 1, 18, 1),
                new Student("Bane Done", "English", 1, 19, 2),
                new Student("Jane Dane", "Science", 1, 20, 3),
                new Student("Pane Dane", "History", 1, 21, 4),
                new Student("Jane Doe", "Math", 1, 22, 5),
                new Student("John Dane", "English", 1, 23, 6)
        );
        menu(register);
    }



// a function that gives the user a menu to choose from using a switch statement, then calls the appropriate function from the Register class
    public static void menu(Register register) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Add Student");
        System.out.println("2. Remove Student");
        System.out.println("3. Get Student By ID");
        System.out.println("4. Get Students By Module");
        System.out.println("5. Print All Students");
        System.out.println("6. Exit");
        System.out.println("Enter your choice: ");

        while(!scanner.hasNextInt()){
            System.out.println("Incorrect input");
            scanner.next();
        }
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                scanner.nextLine();
                String inputFullName = "";
                while(inputFullName.isEmpty()){
                System.out.println("Enter full name: ");
                inputFullName = scanner.nextLine();
                if(inputFullName.isEmpty()){
                    System.out.println("Name was not entered");
                }

                }

                System.out.println("Enter module: ");
                String inputModule = scanner.next();


                // input validation to make sure int is entered
                System.out.print("Please enter Class Year");
                while(!scanner.hasNextInt()){
                    scanner.next();
                    System.out.println("Incorrect input. Please enter Class Year");
                }
                int inputClassYear = scanner.nextInt();



                System.out.println("Enter age: ");
                int inputAge = scanner.nextInt();

                System.out.println("Enter student id: ");
                int inputId = scanner.nextInt();

                addStudent(register, new Student(inputFullName, inputModule, inputClassYear, inputAge, inputId));
                break;
            case 2:
                System.out.println("Enter student id: ");
                int enteredId = scanner.nextInt();
                removeStudentByID(register, enteredId);
                break;
            case 3:
                System.out.println("Enter student id: ");
                int studentsId = scanner.nextInt();
                getStudentById(register, studentsId);
                break;
            case 4:
                System.out.println("Enter module: ");
               String m = scanner.next();
                getStudentsByModule(register, m);
                break;
            case 5:
                printStudents(register);
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        enter();
        menu(register);

    }



public static void enter() {
        System.out.println("Press enter to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }



   // function that prints all students
    public static void printStudents(Register register) {
        register.getStudents().forEach(student -> System.out.println(student.getFullName() + " " + student.getModule() + " " + student.getYearLevel() + " " + student.getAge() + " " + student.getStudentId()));
    }



   public static void addStudent(Register register, Student student) {
        register.add(student);
    }

    public static void removeStudentByID(Register register, int id) {
        register.getStudents().removeIf(student -> student.getStudentId() == id);
    }

    public static void getStudentById(Register register, int id) {
        register.getStudents().stream().filter(student -> student.getStudentId() == id).forEach(student -> System.out.println(student.getFullName()));
    }


    public static void getStudentsByModule(Register register, String module) {
        register.getStudents().stream().filter(student -> student.getModule().equals(module)).forEach(student -> System.out.println(student.getFullName()));
    }

}