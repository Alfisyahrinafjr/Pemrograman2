package Modul1;

import java.util.Scanner;

public class PRAK103_2310817320015_AlfisyahRinaFajriati {
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input");
        System.out.print(" ");
        int N = input.nextInt();

        System.out.print(" ");
        int angka = input.nextInt();

        int count = 0;
        
        System.out.println("Output");

        do {
            if (angka % 2 != 0) {
                System.out.print(angka);
                count++;
                if (count < N) {
                    System.out.print(", ");
                }
            }
            angka++;
        } while (count < N);  
        
        input.close();
    }
}
