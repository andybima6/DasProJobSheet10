import java.util.Scanner;
public class rataNilai031D {
    public static void main(String[] args) {
        Scanner andyNugraha031D = new Scanner(System.in);

        int[] nilaiMHS = new int[10];
        double total031D = 0;
        double rata031D;
        int [] jumlahMHS031D = new int[10];
        int i;

        System.out.println("Masukkan Jumlah MahaSiswa :" );
        jumlahMHS031D[5] = andyNugraha031D.nextInt();

        for ( i = 1; i < nilaiMHS.length; i++)
        {
            System.out.print("Masukkan Nilai Mahasiswa Ke -" + (i) + " :");
            nilaiMHS[i] = andyNugraha031D.nextInt();
        }
         for (i = 0; i < nilaiMHS.length; i++)
            {
            total031D+=nilaiMHS[i];
            }
        rata031D = total031D/nilaiMHS.length;
        System.out.println("Nilai rata-rata kelas ="+rata031D);
    }
}