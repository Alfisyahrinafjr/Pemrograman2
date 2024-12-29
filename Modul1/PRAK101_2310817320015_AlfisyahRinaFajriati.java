package Modul1;

import java.util.Scanner;

public class PRAK101_2310817320015_AlfisyahRinaFajriati {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input:");
        
        System.out.print("Masukkan Nama Lengkap: ");
        String namaLengkap = input.nextLine();
        
        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = input.nextLine();
        
        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggalLahir = input.nextInt();
        
        System.out.print("Masukkan Bulan Lahir: ");
        int bulanLahir = input.nextInt();
        
        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = input.nextInt();
        
        System.out.print("Masukkan Tinggi Badan (cm): ");
        int tinggiBadan = input.nextInt();
        
        System.out.print("Masukkan Berat Badan (kg): ");
        double beratBadan = input.nextDouble();
        
        String[] namaBulan = {"", "Januari", "Februari", "Maret", "April", "Mei", "Juni", 
                              "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        
        System.out.println("Output:");
        System.out.println("Nama Lengkap " + namaLengkap + ", Lahir di " + tempatLahir +
                           " pada Tanggal " + tanggalLahir + " " + namaBulan[bulanLahir] + " " + tahunLahir);
        System.out.println("Tinggi Badan " + tinggiBadan + " cm dan Berat Badan " + beratBadan + " kilogram");
        
        input.close();
    }
}
