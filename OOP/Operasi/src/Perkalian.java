public class Perkalian extends Hitung{
    int i;
    int c;

    public Perkalian(int i, int c) {
        this.i = i;
        this.c = c;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public void menghitungOperasi() {
        super.menghitungOperasi();
        System.out.println("Hasil : " + (i * c));
    }
}
