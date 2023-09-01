import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //80 sampai 100 A
        //65 sampai 79 B+
        //50 sampai 64 B
        //35 sampai 49 C
        //0 sampai 34 D

        Scanner scan = new Scanner(System.in);
        System.out.println("Input studentScore : ");
        int ss = scan.nextInt();
        String nilai = "";

        if (ss >= 80 && ss <= 100) {
            nilai = "A";
        } else if (ss >= 65 && ss <=79) {
            nilai = "B+";
        } else if (ss >= 50 && ss <= 64) {
            nilai = "B";
        } else if (ss >= 35 && ss <=49) {
            nilai = "C";
        } else {
            nilai = "D";
        }
        System.out.println("Nilai " + nilai);
    }
}