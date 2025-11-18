
public class MVCKasirDemo {

    public static void main(String[] args) {
        // Model
        Barang barang = new Barang("GeForce GTX 1060Ti", 3000, 10);

        // View
        KasirView view = new KasirView();

        // Controller
        KasirController controller = new KasirController(barang, view);

        // Tampilkan info awal
        controller.tampilkanInfoBarang();

        // Lakukan transaksi
        controller.prosesTransaksi();

        // Tampilkan info setelah transaksi
        controller.tampilkanInfoBarang();
    }
}
