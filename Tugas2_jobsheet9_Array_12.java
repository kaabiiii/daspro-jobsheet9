import java.util.Scanner;

public class Tugas2_jobsheet9_Array_12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        int arrPesanan, totalBayar = 0;

      
        do {
            System.out.print("Masukkan jumlah pesanan (minimal 1): ");
            arrPesanan = sc12.nextInt();
        } while (arrPesanan < 1); 

        sc12.nextLine();

        String[] namaMakanan = new String[arrPesanan];
        int[] harga = new int[arrPesanan];

        for (int i = 0; i < arrPesanan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + " : ");
            namaMakanan[i] = sc12.nextLine();

            int hargaPesanan;
            do {
                System.out.print("Harga " + namaMakanan[i] + " : ");
                hargaPesanan = sc12.nextInt();
                if (hargaPesanan < 0) {
                    System.out.println("Harga tidak boleh negatif. Silakan masukkan ulang.");
                }
            } while (hargaPesanan < 0); 

            harga[i] = hargaPesanan;
            totalBayar += harga[i];
            sc12.nextLine(); 
        }

        System.out.println("\nPesanan anda adalah:");
        for (int i = 0; i < namaMakanan.length; i++) {
            System.out.println(namaMakanan[i] + " - Harga: " + harga[i]);
        }
        System.out.println("\nTotal Bayar: " + totalBayar);

       
    }
}