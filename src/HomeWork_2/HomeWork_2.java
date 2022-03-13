package HomeWork_2;

public class HomeWork_2 {
    public static void main(String[] args) {

    }
    //ДЗ номер 2. Задача 1

    private static boolean checkSum(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }

    //ДЗ номер 2. Задача 2

    private static void checkNum (int a) {
        if (a >= 0) System.out.println("Число" + a + "положительное");
        else System.out.println("Число" + a + "отрицательное");
    }

    //ДЗ номер 2. Задача 3

    private static boolean checkNum2 (int a) {
        if (a < 0) return true;
        else return false;
    }

    //ДЗ номер 2. Задача 4

    private static void printNumTimes (String s, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(s);
        }
    }

    //ДЗ номер 2. Задача 4

    private static boolean checkYear (int i) {
        if (i % 4 == 0 && i % 400 == 0 && i % 100 == 0 ) return true;
        else return false;
    }

    private static void checkYear123 (int i) {
    if (!(i % 4 == 0) || (i % 100 == 0) && !(i % 400 == 0)) System.out.println(" не високосный");
        else System.out.println("високосный");
    }


}
