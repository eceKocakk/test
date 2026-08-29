import java.util.Scanner;
public class SystemQuiz {
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
        System.out.println("\n--- SİSTEM VE SANALLAŞTIRMA QUIZ ---");

        System.out.println("1. İçerisinde hem ana işlemciyi (CPU) hem de grafik işlemcisini (GPU) tek bir çip üzerinde barındıran birleşik işlemci türü hangisidir?");
        System.out.println("1) APU");
        System.out.println("2) RAM");
        System.out.println("3) NPU");
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
            System.out.println("Yanlış! Doğru cevap: APU\n");
        }

        System.out.println("2. Linux sistemlerde fiziksel RAM yetersiz kaldığında disk üzerinde geçici bellek alanı olarak kullanılan alanın adı nedir?");
        System.out.println("1) Swap");
        System.out.println("2) RAID");
        System.out.println("3) BIOS");
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
            System.out.println("Yanlış! Doğru cevap: Swap\n");
        }

        System.out.println("3. Hangi RAID seviyesi veri güvenliği (yedeklilik) sağlamaz, yalnızca diskler arasında hız ve kapasite birleşimi sunar?");
        System.out.println("1) RAID 1");
        System.out.println("2) RAID 0");
        System.out.println("3) RAID 5");
        System.out.print("Cevabın: ");
        int cevap3 = soruSor(scanner);
        if (cevap3 == CIKIS) {
            System.out.println("\nQuiz yarıda kesildi.");
            return -1;
        }
        if (cevap3 == 2) {
            System.out.println("Doğru!\n");
            puan = puan + 10;
        } else {
            System.out.println("Yanlış! Doğru cevap: RAID 0\n");
        }

        return puan;
    }
}