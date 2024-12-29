package prak203_2310817320015_AlfisyahRinaFajriati;

public class Pegawai {
    public String nama;
    // Terjadi kesalahan karena pada class Soal3Main jumlah karakter lebih dari satu, 
    // sehingga harus menggunkan tipe data string
    // public char asal;
    public String asal;
    public String jabatan;
    public int umur;
    
    public String getNama() {
        return nama;
    }

    public String getAsal() {
    	 return asal;
    	 }

    // Terdapat kesalahan karena parameter j tidak dideklarasikan
    // Diperlukannya parameter untuk menentukan nilai yang akan diatur ke variabel jabatan
    // public void setJabatan() {
        // this.jabatan = j;
    // }
 // }
    public void setJabatan(String j) {
        this.jabatan = j;
    }
    
    // Menambahkan Method setUmur
    public void setUmur(int umur) {
    	this.umur = umur;
    }
}

