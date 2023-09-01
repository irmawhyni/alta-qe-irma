import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan kalimat");
        String kalimat = input.nextLine();
        int a = kalimat.length();
        int b = 0;
        for(int c=0; a<kalimat.length(); a++){
            if (kalimat.charAt(c)==kalimat.charAt(a-1)) {
                a = a - 1;
                b += 1;
            }else{
                break;
            }
        }
        if(b==kalimat.length()) {
            System.out.println(kalimat + "adalah kalimata palindrom");
        } else {
            System.out.println(kalimat + "bukan palindrom");
        }
    }
}