import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creating students using parameterized constructor
        Students sv1 = new Students(1, "Nguyen Van A", 8.0f, 9.0f);
        Students sv2 = new Students(2, "Tran Thi B", 7.5f, 8.5f);

        // Creating a student using default constructor
        Students sv3 = new Students();

        // Input student information from keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien: ");
        sv3.setId(scanner.nextInt());
        scanner.nextLine();  // consume newline
        System.out.println("Nhap ho ten: ");
        sv3.setName(scanner.nextLine());
        System.out.println("Nhap diem LT: ");
        sv3.setDiemLT(scanner.nextFloat());
        System.out.println("Nhap diem TH: ");
        sv3.setDiemTH(scanner.nextFloat());

        // Print the student list
        System.out.printf("%-10s %-20s %-10s %-10s %-10s\n", "MSSV", "Ho Ten", "Diem LT", "Diem TH", "Diem TB");
        System.out.println("--------------------------------------------------------------");
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);

        scanner.close();
    }
}