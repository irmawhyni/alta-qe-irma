import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan angka");
        int bilangan = scan.nextInt();
        System.out.println("Faktor bilangan : ");
        int tambah = 0;
        for (int i = 0; i <= bilangan; i++) {
            tambah++;
            if(bilangan % tambah == 0){
                System.out.println(tambah + " ");
            }
        }
    }
}