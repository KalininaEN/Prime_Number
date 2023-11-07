public class PrimeNumber {
    public static void main(String[] args) {
        checkNumber(11);
    }

    public static void checkNumber(int number) {

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
                System.out.println(number + " - составное число.");
            } else {
                System.out.println(number + " - простое число.");
            }
        } else {
            System.out.println("Вы ввели некорректные данные! Введите целое число больше единицы.");
        }
    }
}




