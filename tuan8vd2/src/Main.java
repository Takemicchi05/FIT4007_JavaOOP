import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập số thứ nhất: ");
            int num1 = scanner.nextInt();

            System.out.print("Nhập số thứ hai: ");
            int num2 = scanner.nextInt();

            System.out.print("Nhập toán tử (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            int result = 0;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Không thể chia cho 0");
                    }
                    result = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Toán tử không hợp lệ.");
            }

            System.out.println("Kết quả: " + result);
`
        } catch (ArithmeticException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi: Vui lòng nhập số nguyên hợp lệ.");
        } finally {
            scanner.close();
        }
    }
}
