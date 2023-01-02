import java.util.Scanner;
public class tugasDua031D {
    public static void main(String[] args) {
        Scanner andyNugraha031D = new Scanner(System.in);
        {

            int[] angka031D = new int[5];

            for (int i = 0; i < angka031D.length; i++) {
                System.out.println("Masukkan Angka ke-" + (i + 1) + ":");
                angka031D[i] = andyNugraha031D.nextInt();
            }
            for (int j = angka031D.length - 1; j >= 0; j--) {
                System.out.println("Hasil Dari Nilai Tersebut Ke " + (j - 5) + ":"+angka031D[j]);
            }
        }
    }
    }
