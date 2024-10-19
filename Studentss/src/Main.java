import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 3 ; i++){
            System.out.println("Enter student id: ");
            String id = scanner.nextLine();
            System.out.println("Enter student name ");
            String name = scanner.nextLine();
            System.out.println("Enter student email ");
            String email = scanner.nextLine();
            System.out.println("Enter student phone ");
            String phone = scanner.nextLine();
            System.out.println("Enter student address ");
            String address = scanner.nextLine();
            System.out.println("Enter student gpa ");
            double gpa = scanner.nextDouble();
            scanner.nextLine();
            Student std = new Student(id, name, email, phone, address, gpa);
            students.add(std);

        }
        //Display all students
        for(Student std: students){
            std.display();
        }
    }
}