import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите задание:");
            System.out.println("1. Операции с переменными");
            System.out.println("2. Разложение числа на простые множители");
            System.out.println("3. Расчет цены со скидкой");
            System.out.println("4. Конвертация температуры в Фаренгейты");
            System.out.println("0. Выход");
            System.out.print("Введите номер задания: ");

            int choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    task1();
                    break;
                case 2:
                    task2();
                    break;
                case 3:
                    task3();
                    break;
                case 4:
                    task4();
                    break;
                case 0:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
            System.out.println();
        }
    }

    // Задание 1: Операции с переменными
    public static void task1() {
        System.out.println("Задание 1: Операции с переменными");

        int a = 10;
        double b = 5.5;
        boolean c = true;

        int sum = a + 5;
        double div = b / 2;
        boolean notC = !c;

        System.out.println("a + 5 = " + sum);
        System.out.println("b / 2 = " + div);
        System.out.println("!c = " + notC);
    }

    // Задание 2: Разложение числа на простые множители
    public static void task2() {
        System.out.println("Задание 2: Разложение числа на простые множители");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        System.out.print("Простые множители: ");
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }
        System.out.println();
    }

    // Задание 3: Расчет цены со скидкой
    public static void task3() {
        System.out.println("Задание 3: Расчет цены со скидкой");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите исходную цену товара: ");
        double originalPrice = scanner.nextDouble();

        System.out.print("Введите процент скидки: ");
        double discountRate = scanner.nextDouble();

        double discount = originalPrice * discountRate / 100;
        double newPrice = originalPrice - discount;

        System.out.printf("Новая цена со скидкой: %.2f\n", newPrice);
    }

    // Задание 4: Конвертация температуры в Фаренгейты
    public static void task4() {
        System.out.println("Задание 4: Конвертация температуры в Фаренгейты");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите температуру в градусах Цельсия: ");
        int celsius = scanner.nextInt();

        double fahrenheit = (celsius * 9.0 / 5) + 32;
        System.out.printf("Температура в градусах Фаренгейта: %.2f\n", fahrenheit);
    }
}
