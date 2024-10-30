import java.util.Scanner;
public class ArrayRataNilai {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner (System.in);

        int [] nilaiMhs = new int [10];
        double total=0, rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + (i+1)+ " : ");
            nilaiMhs[i] = sc12.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
        rata2 = total/nilaiMhs.length;
        System.out.println("rata-rata nilai = " + rata2);
        
    }
    
}
