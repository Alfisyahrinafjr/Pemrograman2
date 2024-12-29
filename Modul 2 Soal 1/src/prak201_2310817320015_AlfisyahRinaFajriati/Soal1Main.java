package prak201_2310817320015_AlfisyahRinaFajriati;

public class Soal1Main {
    public static void main(String[] args) {
        TokoBuah apel = new TokoBuah();
        apel.namaBuah = "Apel";
        apel.beratPerSatuan = 0.4;
        apel.hargaPerSatuan = 7000;
        apel.jumlahBeli = 40.0;

        TokoBuah mangga = new TokoBuah();
        mangga.namaBuah = "Mangga";
        mangga.beratPerSatuan = 0.2;
        mangga.hargaPerSatuan = 3500;
        mangga.jumlahBeli = 15.0;

        TokoBuah alpukat = new TokoBuah();
        alpukat.namaBuah = "Alpukat";
        alpukat.beratPerSatuan = 0.25;
        alpukat.hargaPerSatuan = 10000;
        alpukat.jumlahBeli = 12.0;

        apel.tampilkanDetail();
        mangga.tampilkanDetail();
        alpukat.tampilkanDetail();
    }
}

