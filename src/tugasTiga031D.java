import java.util.Scanner;
public class tugasTiga031D {
    public static void main(String[] args) {
        Scanner andyNugraha031D = new Scanner(System.in);

        int jumlahArray031D;
        System.out.println("Masukkan Isi Array :");
        jumlahArray031D = andyNugraha031D.nextInt();

        int[] elemenArray031D = new int[jumlahArray031D];
        for (int i = 0; i < elemenArray031D.length; i++) {
            System.out.println("Masukkan Nilai Array ke-" + (i + 1) + ":");
            elemenArray031D[i] = andyNugraha031D.nextInt();
        }
        int maximal031D = elemenArray031D[0];
        for (int i = 0; i < jumlahArray031D; i++) {
            if (elemenArray031D[i] > maximal031D) {
                maximal031D = elemenArray031D[i];
            }
        }
        System.out.println("Bilangan Terbesar Adalah :" + maximal031D);
    }
}

