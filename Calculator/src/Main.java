
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(calc(a));
    }

    public static String calc(String input) throws Exception {
        String[] arr = input.split(" ");
        try {
            int x = Integer.parseInt(arr[0]);
            int y = Integer.parseInt(arr[2]);

            if ((x <= 10 && x > 0) && (y <= 10 && y > 0) && arr.length == 3) {
                switch (arr[1]) {
                    case "+":
                        return Integer.toString(x + y);
                    case "-":
                        return Integer.toString(x - y);
                    case "*":
                        return Integer.toString(x * y);
                    case "/":
                        return Integer.toString(x / y);
                    default:
                        throw new Exception("НЕИЗВЕСТНАЯ ОПЕРАЦИЯ");
                }

            } else {
                throw new Exception("НЕВЕРНЫЙ ОПЕРАНД");
            }


        } catch (Exception a) {
            throw new Exception("ОШИБКА ВВОДА");

        }

    }
}
