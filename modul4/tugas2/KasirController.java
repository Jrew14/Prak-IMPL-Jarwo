import java.util.Scanner;

public class KasirController {

    private Barang model;
    private KasirView view;

    public KasirController(Barang model, KasirView view) {
        this.model = model;
        this.view = view;
    }

    public void tampilkanInfoBarang() {
        view.tampilkanInfoBarang(model.getNama(), model.getHarga(), model.getStok());
    }

    public void prosesTransaksi() {
        Scanner in = new Scanner(System.in);

        view.tampilkanJudulTransaksi();
        view.tampilkanInputJumlah();
        int qty = in.nextInt();

        if (qty > model.getStok()) {
            view.tampilkanStokTidakCukup();
            return;
        }

        int totalBayar = qty * model.getHarga();
        model.setStok(model.getStok() - qty);

        view.tampilkanHasilTransaksi(qty, totalBayar);
    }
}
