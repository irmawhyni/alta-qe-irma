public class Pengurangan extends Hitung{
    int i;
    int b;

    public Pengurangan(int i, int b) {
        this.i = i;
        this.b = b;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public void menghitungOperasi() {
        super.menghitungOperasi();
        System.out.println("Hasil : " + (i-b));
    }
}
