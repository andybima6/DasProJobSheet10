import java.util.Scanner;
public class tugasSatu031D {
    public static void main(String[] args) {
        Scanner andyNugraha031D = new Scanner(System.in);

        int angkaBulan031D;
        char menu031D = 'y';

        do {
            String[] bulan = new String[12];
            bulan[0] = "Januari";
            bulan[1] = "Februari";
            bulan[2] = "Maret";
            bulan[3] = "April";
            bulan[4] = "Mei";
            bulan[5] = "Juni";
            bulan[6] = "Juli";
            bulan[7] = "Agustus";
            bulan[8] = "September";
            bulan[9] = "Oktober";
            bulan[10] = "November";
            bulan[11] = "Desember";
            System.out.println("Masukkan Bulan keberapa (0-11) :");
            angkaBulan031D = andyNugraha031D.nextInt();
            System.out.println((bulan[angkaBulan031D]));
            System.out.println("Apakah Anda Ingin Mengulangi (Y/T)");
            menu031D = andyNugraha031D.next().charAt(0);
        }
        while (menu031D == 'y' || menu031D == 'Y');
    }
}