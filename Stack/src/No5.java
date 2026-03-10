import java.util.Scanner;

public class No5 {

    static void printSeq(int n) {
        if (n == 0) return;
        printSeq(n / 2);
        if (n > 0) System.out.print(n + " ");
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Masukkan angka: ");
            int n = scan.nextInt();
            printSeq(n);
        }
    }
}