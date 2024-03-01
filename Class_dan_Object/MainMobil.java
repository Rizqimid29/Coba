package Class_dan_Object;

public class MainMobil {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();

        mobil1.merk = "Innova Reborn";
        mobil1.platNomor = "S 1999 AB";

        mobil1.maju();
        mobil1.mundur();
    }
}
