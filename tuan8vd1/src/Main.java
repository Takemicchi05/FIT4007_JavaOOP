import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
//           String changtrai = "Anh yêu em!";
//           String cogai = scanner.nextLine();
//           System.out.println(cogai);

           String cogai = null;
           System.out.println(cogai);
        } catch (Exception ten) {
            System.out.println("thất tình!");
            System.out.println(ten.getMessage());
        } finally {
            System.out.println("Chàng trai vẫn nói j đấy!");
        }

    }
}