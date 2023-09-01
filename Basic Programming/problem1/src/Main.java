import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Input nilai alas : ");
        double alasInput = input.nextInt();
        System.out.println("Input nilai tinggi : ");
        double tinggiInput = input.nextInt();

        double luasHasil = (0.5 * alasInput * tinggiInput);

        System.out.println("Hasil luas input user = " + luasHasil);
    }
}