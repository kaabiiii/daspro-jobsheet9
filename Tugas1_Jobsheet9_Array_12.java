import java.util.Scanner;

public class Tugas1_Jobsheet9_Array_12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        double rata2, total = 0;
        int jmlMhs;
        int nilaiTinggi = 0, nilaiRendah = 100;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jmlMhs = sc12.nextInt();
        int nilaiMhs[] = new int[jmlMhs];

        for (int i = 0; i < nilaiMhs.length; i++) {
            do {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " (0-100): ");
                nilaiMhs[i] = sc12.nextInt();
            } while (nilaiMhs[i] < 0 || nilaiMhs[i] > 100); 
            if (nilaiMhs[i] > nilaiTinggi) {
                nilaiTinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < nilaiRendah) {
                nilaiRendah = nilaiMhs[i];
            }
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        System.out.println();
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " adalah " + nilaiMhs[i]);
        }
        System.out.println();

        rata2 = total / nilaiMhs.length;
        System.out.println("Rata-rata nilai = " + rata2);
        System.out.println("Nilai tertinggi = " + nilaiTinggi);
        System.out.println("Nilai terendah = " + nilaiRendah);

        
    }
}