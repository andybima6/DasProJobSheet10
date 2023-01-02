import java.util.Scanner;
public class ArrayInputLoop031D {
    public static void main(String[] args) {
        Scanner andyNugraha031D = new Scanner(System.in);

        int banyakMHS031D;
        System.out.println("Masukkan Jumlah Mahasiswa :");
        banyakMHS031D = andyNugraha031D.nextInt();
        int [] nilaiMHS031D = new int [banyakMHS031D];
        double rata1,rata2;
        double total1 = 0,total2 = 0,nilai1 = 0,nilai2 = 0;

        for (int i = 0; i < nilaiMHS031D.length;i++){
            System.out.println("Masukkan Nilai Mahasiswa Ke -"+(i+1)+":");
            nilaiMHS031D[i] = andyNugraha031D.nextInt();
        }
        for (int i = 0; i < nilaiMHS031D.length;i++){
            if(nilaiMHS031D[i] <= 70){
                total1 += nilaiMHS031D[i];
                nilai1 ++;
            }else if (nilaiMHS031D[i] > 70){
                total2 += nilaiMHS031D[i];
                nilai2 ++;
            }
        }
        rata2 = total2/nilai2;
        System.out.println("NIlai Rata rata Mahasiswa Yang Lulus Adalah :"+rata2);
        rata1 = total1/nilai1;
        System.out.println("Nilai Rata rata Mahasiswa Yang tidak Lulus adalah :"+rata1 );
        }
    }