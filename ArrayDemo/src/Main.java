import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> dsDiem = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        //Nhập danh sách điểm
        for(int i = 0; i < 45; i++){
            System.out.println("Nhập điểm của sinh viên thứ: "  + (i+1) +  ": ");
            double diem = scanner.nextDouble();
            dsDiem.add(diem);
//            dsDiem.add(scanner.nextDouble());
        }

        //Hiển thị danh sách
        System.out.println("Danh sách điểm của sv:");
        for(int i = 0;i < dsDiem.size();i++){
            System.out.println("Điểm của sv thứ " + (i + 1) + ": " + dsDiem.get(i));
        }
    }
}