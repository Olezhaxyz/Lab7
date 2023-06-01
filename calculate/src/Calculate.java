import java.util.Scanner;
public class Calculate {
    public static void main(String[] args) {
        double num1;
        double num2;
        double ans;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("Напишите 2 числа: ");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print("\nВыберите действие (+, -, *, /): ");
        op = reader.next().charAt(0);
        try {
            switch (op) {
                case '+' -> ans = num1 + num2;
                case '-' -> ans = num1 - num2;
                case '*' -> ans = num1 * num2;
                case '/' -> {
                    if (num2 == 0) {
                        throw new ArithmeticException("Деление на 0 невозможно");
                    } else {
                        ans = num1 / num2;
                    }
                }
                default -> throw new IllegalStateException("Unexpected value: " + op);
            }
            System.out.print("\nРезультат:\n");
            System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (IllegalStateException e){
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}