import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {
        Quiz app = new Quiz();
        app.baslat();
    }
    public void baslat() {
        Scanner scanner = new Scanner(System.in);
        LinuxQuiz linux = new LinuxQuiz();
        SystemQuiz sistem = new SystemQuiz();
        NetworkQuiz network = new NetworkQuiz();

        int toplamPuan = 0;
        boolean devamEt = true;

        System.out.println("=== Yazılım Kampı Mini Quizine Hoş Geldin! ===");
        System.out.println("İpucu: Quiz içerisindeyken her an çıkmak için 'q' tuşuna basabilirsin.\n");

        while (devamEt) {
            System.out.println("1 - Linux Komutları");
            System.out.println("2 - Sistem ve Donanım");
            System.out.println("3 - Network");
            System.out.print("Hangi kategoriyi çözmek istiyorsun? Seçimin (1-3) (Çıkış için q): ");

            String secim = scanner.next();
            if (secim.equalsIgnoreCase("q")) {
                System.out.println("Quizden çıkılıyor...");
                break;
            }

            int kategori;
            try {
                kategori = Integer.parseInt(secim);
            } catch (NumberFormatException e) {
                System.out.println("Geçersiz seçim yaptın!\n");
                continue;
            }

            int kategoriPuani;
            if (kategori == 1) {
                kategoriPuani = linux.baslat(scanner);
            } else if (kategori == 2) {
                kategoriPuani = sistem.baslat(scanner);
            } else if (kategori == 3) {
                kategoriPuani = network.baslat(scanner);
            } else {
                System.out.println("Geçersiz seçim yaptın!\n");
                continue;
            }

            if (kategoriPuani == -1) {
                break;
            }

            toplamPuan += kategoriPuani;
            System.out.println("Bu kategoriden aldığın puan: " + kategoriPuani);
            System.out.println("Şu anki Toplam Puanın: " + toplamPuan + "\n");

            System.out.print("Başka bir kategori çözmek ister misin? (e/h): ");
            String cevap = scanner.next();
            if (cevap.equalsIgnoreCase("h")) {
                devamEt = false;
            }
            System.out.println();
        }

        System.out.println("Quiz bitti! Toplam Puanın: " + toplamPuan);
        System.out.println("Katıldığın için teşekkürler!");
        scanner.close();
    }
}