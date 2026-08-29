import java.util.Scanner;
public class NetworkQuiz {
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
        System.out.println("\n--- NETWORK ---");

        System.out.println("1. Fiziksel olarak aynı yerel ağda bulunan cihazları, mantıksal olarak ayrı sanal ağlara bölmek için kullanılan teknolojinin adı nedir?");
        System.out.println("1) VLAN");
        System.out.println("2) WAN");
        System.out.println("3) MAC");
        System.out.print("Cevabın: ");
        int cevap1 = soruSor(scanner);
        if (cevap1 == CIKIS) {
            System.out.println("\nQuiz yarıda kesildi.");
            return -1;
        }
        if (cevap1 == 1) {
            System.out.println("Doğru!\n");
            puan = puan + 10;
        } else {
            System.out.println("Yanlış! Doğru cevap: VLAN\n");
        }

        System.out.println("2. Şehirler veya ülkeler arası gibi çok geniş coğrafi alanları birbirine bağlayan ağ türü hangisidir?");
        System.out.println("1) LAN");
        System.out.println("2) WAN");
        System.out.println("3) VLAN");
        System.out.print("Cevabın: ");
        int cevap2 = soruSor(scanner);
        if (cevap2 == CIKIS) {
            System.out.println("\nQuiz yarıda kesildi.");
            return -1;
        }
        if (cevap2 == 2) {
            System.out.println("Doğru!\n");
            puan = puan + 10;
        } else {
            System.out.println("Yanlış! Doğru cevap: WAN\n");
        }

        System.out.println("3. Yerel ağ (LAN) içindeki cihazları birbirine bağlayan ve veri paketlerini sadece ilgili hedefe yönlendiren ağ cihazı hangisidir?");
        System.out.println("1) Switch (Anahtar)");
        System.out.println("2) Router (Yönlendirici)");
        System.out.println("3) Modem");
        System.out.print("Cevabın: ");
        int cevap3 = soruSor(scanner);
        if (cevap3 == CIKIS) {
            System.out.println("\nQuiz yarıda kesildi.");
            return -1;
        }
        if (cevap3 == 1) {
            System.out.println("Doğru!\n");
            puan = puan + 10;
        } else {
            System.out.println("Yanlış! Doğru cevap: Switch (Anahtar)\n");
        }

        return puan;
    }
}