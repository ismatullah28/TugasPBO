public class Product {

    public String Sendal;
    public String Jumlah;
    public String Harga;

    public Product(String Sendal, String Jumlah, String Harga) {
        this.Sendal = Sendal;
        this.Jumlah = Jumlah;
        this.Harga = Harga;

    }
    public String getSendal() {
        return Sendal;
    }

    public void setSendal(String Sendal) {
        this.Sendal = Sendal;
    }

    public String getJumlah() {
        return Jumlah;
    }

    public void setJumlah(String Jumlah) {
        this.Jumlah = Jumlah;
    }

    public String getHarga() {
        return Harga;
    }

    public void setHarga(String Harga) {
        this.Harga = Harga;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Minuman='" + Sendal + '\'' +
                ",Jumlah='" + Jumlah + '\'' +
                ",Harga='" + Harga + '\'' +
                '}';
    }

    public static void main(String[] args) {
	// write your code here
    }
}
