public class Kubus extends BangunRuang{
    int sisi;

    public Kubus(int sisi) {
        this.sisi = sisi;
    }

    @Override
    public void hitungVolume() {
        super.hitungVolume();
        System.out.println("Volume Kubus adalah " + (sisi * sisi *sisi));
    }
}
