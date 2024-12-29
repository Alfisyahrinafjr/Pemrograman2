package Modul1;

import java.util.Scanner;

public class PRAK104_2310817320015_AlfisyahRinaFajriati {
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input");

        System.out.print("Tangan Abu: ");
        String abuInput = input.nextLine();
        System.out.print("Tangan Bagas: ");
        String bagasInput = input.nextLine();
        String[] abuPilihan = abuInput.split(" ");
        String[] bagasPilihan = bagasInput.split(" ");

        int poinAbu = 0;
        int poinBagas = 0;
        
        System.out.println("Output");

        for (int i = 0; i < 3; i++) {
            String abu = abuPilihan[i];
            String bagas = bagasPilihan[i];

            if (abu.equals(bagas)) {
                continue;
            } else if ((abu.equals("B") && bagas.equals("G")) ||
                       (abu.equals("G") && bagas.equals("K")) ||
                       (abu.equals("K") && bagas.equals("B"))) {
                poinAbu++;
            } else {
                poinBagas++;
            }
        }
        if (poinAbu > poinBagas) {
            System.out.println("Abu");
        } else if (poinBagas > poinAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
        input.close();
    }
}
