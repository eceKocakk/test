import java.util.Scanner;
public class LinuxQuiz {
    private static final int CIKIS = -2;

    private int soruSor(Scanner scanner) {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        }
        String girdi = scanner.next();
        if (girdi.equalsIgnoreCase("q")) {
            return CIKIS;
        }
        return -1;
    }
    public int baslat(Scanner scanner) {
        int puan = 0;
        System.out.println("\n--- LİNUX QUIZ ---");

        System.out.println("1. Bulunduğun dizini gösteren komut hangisidir?");
        System.out.println("1) ls");
        System.out.println("2) pwd");
        System.out.println("3) cd");
        System.out.print("Cevabın: ");
        int cevap1 = soruSor(scanner);
        if (cevap1 == CIKIS) {
            System.out.println("\nQuiz yarıda kesildi.");
            return -1;
        }
        if (cevap1 == 2) {
            System.out.println("Doğru!\n");
            puan = puan + 10;
        } else {
            System.out.println("Yanlış! Doğru cevap: pwd\n");
        }
        
        System.out.println("2. Terminalde ekrana yazdırma komutu hangisidir?");
        System.out.println("1) echo");
        System.out.println("2) ls");
        System.out.println("3) nano");
        System.out.print("Cevabın: ");
        int cevap2 = soruSor(scanner);
        if (cevap2 == CIKIS) {
            System.out.println("\nQuiz yarıda kesildi.");
            return -1;
        }
        if (cevap2 == 1) {
            System.out.println("Doğru!\n");
            puan = puan + 10;
        } else {
            System.out.println("Yanlış! Doğru cevap: echo\n");
        }

        System.out.println("3. Bir dizini hangi komutla silebiliriz?");
        System.out.println("1) rm");
        System.out.println("2) mv");
        System.out.println("3) rm -r");
        System.out.print("Cevabın: ");
        int cevap3 = soruSor(scanner);
        if (cevap3 == CIKIS) {
            System.out.println("\nQuiz yarıda kesildi.");
            return -1;
        }
        if (cevap3 == 3) {
            System.out.println("Doğru!\n");
            puan = puan + 10;
        } else {
            System.out.println("Yanlış! Doğru cevap: rm -r\n");
        }

        return puan;
    }
}