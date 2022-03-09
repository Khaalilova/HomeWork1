package HomeWork;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

        public static void printThreeWords () {
            String s = "Orange";
            String s1 = "Banana";
            String s2 = "Apple";
            System.out.println(s);
            System.out.println(s1);
            System.out.println(s2);
        }

        public static void checkSumSign() {
        int a = 2;
        int b = 5;
        int i = a + b;
        if (i>= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
        }

        public static void printColor() {
        int value = 0;
        if (value <=0) {
            System.out.println("Красный");
        }
        else if (value > 0 && value <=100) {
            System.out.println("Желтый");
        }
        else if (value > 100) {
                System.out.println("Зеленый");
            }
    }
        public static void compareNumbers() {
        int a = 1;
        int b = 2;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
        }

    }

