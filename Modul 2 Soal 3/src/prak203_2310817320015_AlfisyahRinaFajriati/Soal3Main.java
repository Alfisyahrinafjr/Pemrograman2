package prak203_2310817320015_AlfisyahRinaFajriati;

public class Soal3Main {
	public static void main(String[] args) {
		Pegawai p1 = new Pegawai();
		// Terjadi kesalahan karena kurangnya tanda "titik koma"
		// p1.nama = "Roi"
		p1.nama = "Roi";
		// Terjadi kesalahan karena bertipe data char pada class Pegawai
		// Tipe data char hanya bisa menyimpan satu karakter
		p1.asal = "Kingdom of Orvel"; 
		// Terdapat kesalahan karena parameter j tidak dideklarasikan pada class pegawai
		p1.setJabatan("Assasin");
           // Tidak adanya inisialisasi umur, sehingga secara default nilainya akan menjadi 0
		p1.setUmur(17);
		
		System.out.println("Nama Pegawai: " + p1.getNama());
		System.out.println("Asal: " + p1.getAsal());
		System.out.println("Jabatan: " + p1.jabatan);
		System.out.println("Umur: " + p1.umur);
	}
}

