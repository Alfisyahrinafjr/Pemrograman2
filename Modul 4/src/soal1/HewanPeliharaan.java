package soal1;

import java.util.Scanner;

public class HewanPeliharaan {
	private String nama;
	private String ras;

	public HewanPeliharaan(String n, String r) {
		this.nama = n;
		this.ras = r;
	}
	
	public void display() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama Hewan Peliharaan: ");
        this.nama = scanner.nextLine();

        System.out.print("Ras: ");
        this.ras = scanner.nextLine();
        
        System.out.println();
        
        System.out.println("Detail Hewan Peliharaan: ");
		System.out.println("Nama Hewan Peliharaanku adalah: " + nama);
		System.out.println("Dengan Ras: " + ras);

        scanner.close();
    }

}
