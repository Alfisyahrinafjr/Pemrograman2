package Modul1;

import java.util.Scanner;

public class PRAK102_2310817320015_AlfisyahRinaFajriati {
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input");
        int angkaAwal = input.nextInt();

        int count = 0;
        int bilangan = angkaAwal;
        
        System.out.println("Output");

        while (count < 11) {           
            if (bilangan % 5 == 0) {
                int hasil = (bilangan / 5) - 1;
                System.out.print(hasil + ", ");
            } else {
                System.out.print(bilangan + ", ");
            }
            
            bilangan++;
            count++;
        }
        input.close();
    }
}