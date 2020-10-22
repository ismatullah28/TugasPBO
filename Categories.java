public class Categories {

    public String Jenis;
    public String Ukuran;
    public String Merk;

    public Categories(String Jenis, String Ukuran, String Merk) {
        this.Jenis = Jenis;
        this.Ukuran = Ukuran;
        this.Merk = Merk;

    }
    public String getJenis() {
        return Jenis;
    }

    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }

    public String getUkuran() {
        return Ukuran;
    }

    public void setUkuran(String Ukuran) {
        this.Ukuran = Ukuran;
    }

    public String getMerk() {
        return Merk;
    }

    public void setMerk(String Merk) {
        this.Merk = Merk;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "Jenis='" + Jenis + '\'' +
                ",Ukuran='" + Ukuran + '\'' +
                ",Merk='" + Merk + '\'' +
                '}';
    }
    public static void main(String[] args) {

    }
}
