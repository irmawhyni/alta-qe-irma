public class Main {
    public static void main(String[] args) {
        Angka angka = new Angka(3,4);
        angka.menghitungOperasi();

        Pengurangan pengurangan = new Pengurangan(15,4);
        pengurangan.menghitungOperasi();

        Perkalian perkalian = new Perkalian(10, 10);
        perkalian.menghitungOperasi();

        Pembagian pembagian = new Pembagian(12,3);
        pembagian.menghitungOperasi();
    }

}