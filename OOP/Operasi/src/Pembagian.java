public class Pembagian extends Hitung {
    int i;
    int d;

    public Pembagian(int i, int d) {
        this.i = i;
        this.d = d;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    @Override
    public void menghitungOperasi() {
        super.menghitungOperasi();
        System.out.println("Hasil : " + (i / d));
    }
}
