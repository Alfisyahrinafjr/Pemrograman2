package prak201_2310817320015_AlfisyahRinaFajriati;

public class TokoBuah {
    String namaBuah;
    double beratPerSatuan;
    double hargaPerSatuan;
    double jumlahBeli;

    public double hitungHargaSebelumDiskon() {
        double totalBerat = jumlahBeli;
        double hargaSebelumDiskon = (totalBerat / beratPerSatuan) * hargaPerSatuan;
        return hargaSebelumDiskon;
    }

    public double hitungDiskon() {
        double totalBerat = jumlahBeli; 
        int diskonPerBerat = (int) (totalBerat / 4); 
        double totalDiskon = diskonPerBerat * (0.02 * hitungHargaSebelumDiskon());
        return totalDiskon;
    }

    public double hitungHargaSetelahDiskon() {
        return hitungHargaSebelumDiskon() - hitungDiskon();
    }

    public void tampilkanDetail() {
        System.out.printf("Nama Buah: %s%n", namaBuah);
        System.out.printf("Berat: %.2fkg%n", beratPerSatuan);
        System.out.printf("Harga: Rp%.2f%n", hargaPerSatuan);
        System.out.printf("Jumlah Beli: %.2fkg%n", jumlahBeli);
        System.out.printf("Harga Sebelum Diskon: Rp%.2f%n", hitungHargaSebelumDiskon());
        System.out.printf("Total Diskon: Rp%.2f%n", hitungDiskon());
        System.out.printf("Harga Setelah Diskon: Rp%.2f%n", hitungHargaSetelahDiskon());
        System.out.println();
    }
}

