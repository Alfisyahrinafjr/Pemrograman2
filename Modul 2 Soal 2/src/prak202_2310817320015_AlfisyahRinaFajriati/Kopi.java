package prak202_2310817320015_AlfisyahRinaFajriati;

public class Kopi {
	String namaKopi;
	String ukuran;
	int harga;
	String pembeli;

void info() {
    System.out.println("Nama Kopi: " + namaKopi);
    System.out.println("Ukuran Kopi: " + ukuran);
    System.out.println("Harga Kopi: Rp. " + harga);
}

void setPembeli(String pembeli) {
    this.pembeli = pembeli;
}

String getPembeli() {
    return this.pembeli;
}

double getPajak() {
    return harga * 0.11;
}
}

