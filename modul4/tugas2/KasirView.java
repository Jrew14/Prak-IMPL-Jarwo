public class KasirView {

    public void tampilkanInfoBarang(String nama, int harga, int stok) {
        System.out.println("Nama Barang : " + nama);
        System.out.println("Harga Barang : " + harga);
        System.out.println("Stok Barang : " + stok);
    }

    public void tampilkanJudulTransaksi() {
        System.out.println("Transaksi Pembelian");
    }

    public void tampilkanInputJumlah() {
        System.out.print("Jumlah barang : ");
    }

    public void tampilkanHasilTransaksi(int qty, int totalBayar) {
        System.out.println("Jumlah Bayar : " + totalBayar);
    }

    public void tampilkanStokTidakCukup() {
        System.out.println("Stok tidak mencukupi.");
    }
}
