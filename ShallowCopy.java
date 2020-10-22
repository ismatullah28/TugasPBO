public class ShallowCopy {
    public static void main(String args[]) {
        ShallowCopy main = new ShallowCopy();
        main.whenShallowCopying_thenObjectsShouldNotBeSame();
    }

    public void whenShallowCopying_thenObjectsShouldNotBeSame() {
        Product product = new Product("Sendal Terapi, Sendal pasaran", "50 barang", "50.000/1 pcs");
        Categories Sendal = new Categories("sendal jepit, Sendal gunung", "38-39-40-41-42", "Carvill, Supreme");
        Categories Saya = new Categories(Sendal.getJenis(),Sendal.getUkuran(),Sendal.getMerk());

        System.out.println(Saya);
        System.out.println(Sendal);
    }
}
