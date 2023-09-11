// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число 4значаное");
        int a = sc.nextInt();
        byte a1 = (byte) (a % 10);
        byte a2 = (byte) (a / 10 % 10);
        byte a3 = (byte) (a / 100 % 10);
        byte a4 = (byte) (a / 1000 % 10);
        byte res = (byte) (a1 + a2 + a3 +a4);
        System.out.println("Сумма чисел  : " + res);

        }

    }
