public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        System.out.println("\nЗадание 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("\nЗадание 3");
        for (int i = 0; i <= 17; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

        System.out.println("\nЗадание 4");
        for (int i = 10; i > -10; i--) {
            System.out.println(i);
        }

        System.out.println("\nЗадание 5");
        for (int i = 1904; i < 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }

        System.out.println("\nЗадание 6");
        for (int i = 1; i < 15; i++) {
            System.out.print(7 * i + " ");
        }

        System.out.println("\nЗадание 7");
        for (int i = 0; i < 10; i++) {
            System.out.print((int) Math.pow(2, i) + " ");
        }

        System.out.println("\nЗадание 8");
        int savingsPerMonth = 29000;
        int total = 0;
        for (int i = 1; i < 13; i++) {
            total += savingsPerMonth;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("\nЗадание 9");
        total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + total / 100;
            total += savingsPerMonth;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("\nЗадание 10");
        for (int i = 1; i < 11; i++) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }

    }
}