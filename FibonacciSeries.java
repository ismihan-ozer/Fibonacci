import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Eleman sayısını giriniz: ");
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;

        System.out.print(n + " Elemanlı Fibonacci Serisi: ");

        for (int i = 0; i < n; i++) {

            if (i == 0) {
                System.out.print(a + " ");
            } else {

                int temp = a + b;
                System.out.print(temp + " ");
                a = b;
                b = temp;
            }
        }


    }
}
