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
                case '/' -> ans = num1 / num2;
                default -> {
                    throw new IllegalArgumentException("Ошибка! Неправильный оператор");
                }
            }
            System.out.print("\nРезультат:\n");
            System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}