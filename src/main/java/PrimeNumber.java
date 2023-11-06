import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число больше единицы: ");

        int number = scanner.nextInt();
        System.out.println("Спасибо! Вы ввели число " + number);

        if (number > 1) {
            int i = 2;
            boolean reminder = false;
            while (i < number) {
                if (number % i == 0) {
                    reminder = true;
                    break;
                }
                i++;
            }
            if (reminder) {
                System.out.println(number + " - составное число");
            } else {
                System.out.println(number + " - простое число");
            }
        }
    }
}



