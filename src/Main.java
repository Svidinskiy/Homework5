public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        char clientOS = 1;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("\n");
    }

    public static void task2 () {
        System.out.println("Задача 2");
        char clientOS = 0;
        char clientDeviceYear = 2014;
        if (clientOS == 0){
            if (clientDeviceYear < 2015) System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            else System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1){
            if (clientDeviceYear < 2015) System.out.println("Установите облегченную версию приложения для Android по ссылке");
            else System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("\n");
    }
    public  static  void task3 () {
        System.out.println("Задача 3");
        int year = 2024;
        boolean leapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (leapYear) {
            System.out.println(year + " високосный год");;
        } else {
            System.out.println(year + " не високосный год");
        }

        System.out.println("\n");
    }
    public  static void task4 () {
        System.out.println("Задача 4");
        char deliveryDistance = 6;
        int days = 1;
        if (deliveryDistance < 20){
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            days += 1;
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            days += 2;
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставка не осуществляется");
        }

        System.out.println("\n");
    }
    public  static void task5 () {
        System.out.println("Задача 5");
        char monthNumber = 4;
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого меясца не существует");
        }
        System.out.println("\n");
    }
}