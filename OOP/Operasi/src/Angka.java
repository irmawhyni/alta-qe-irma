public class Angka extends Hitung{
    int i;
    int a;

    public Angka(int i, int a) {
        this.i = i;
        this.a = a;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    //Penjumlahan
    @Override
    public void menghitungOperasi() {
        super.menghitungOperasi();
        System.out.println("Hasil : " + (i + a));
    }
}
