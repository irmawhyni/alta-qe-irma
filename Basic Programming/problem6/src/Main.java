import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // simbol X mewakili kelipatan 3
        // simbol Z mewakili kelipatan genap
        // simbol Y mewakili kelipatan ganjil
        Scanner scan = new Scanner((System.in));
        System.out.print("Input: ");
        int hrf = scan.nextInt();
        table(hrf);
    }

    public static void table(int angka1) {
        int hrf = 1;
        for (int i = 1; i <= angka1; i++) {
            for (int j = 1; j <= angka1; j++) {
                System.out.print(wakil(hrf) + " ");
                hrf++;
            }
            System.out.println();
        }

    }

    public static char wakil(int hrf) {
        char result;
        if (hrf % 3 == 0) {
            result = 'X';
        } else if (hrf %2 == 0) {
            result = 'Z';
        } else {
            result = 'Y';
        }
        return result;
    }
}