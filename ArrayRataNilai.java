import java.util.Scanner;
public class ArrayRataNilai {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner (System.in);
        System.out.println("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc12.nextInt();
        int [] nilaiMhs = new int [jmlMhs];
        int lulus = 0, tdklulus =0;
        double total=0, rata2, totalLulus = 0, totalTdkLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + (i+1)+ " : ");
            nilaiMhs[i] = sc12.nextInt();
            
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + " lulus!");
                totalLulus += nilaiMhs[i];
                lulus++;
            } else {
                System.out.println("Mahasiswa ke-" + (i + 1) + " tidak lulus!");
                totalTdkLulus += nilaiMhs[i];
                tdklulus++;
                
            }
        }
        
        rata2 = total/nilaiMhs.length;
        System.out.println("rata-rata nilai keseluruhan = " + rata2);
        double rata2Lulus = totalLulus / lulus;
        double rata2TidakLulus =  totalTdkLulus / tdklulus;

        System.out.println("rata rata nilai mahasiswa yang lulus: " + rata2Lulus);
        System.out.println("rata rata nilai mahasiswa yang tidak lulus: " + rata2TidakLulus);
    }
    }
    

