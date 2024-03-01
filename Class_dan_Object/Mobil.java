package Class_dan_Object;

public class Mobil {
    String merk;
    String platNomor;
    int tahun;
    String transmisi;

    public void maju() {
        System.out.printf("Mobil %s dengan plat nomor %s bergerak maju\n", merk, platNomor);
    }
    public void mundur() {
        System.out.printf("Mobil %s dengan plat nomor %s bergerak mundur\n", this.merk, this.platNomor);
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
}
