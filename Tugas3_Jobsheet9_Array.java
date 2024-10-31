import java.util.Scanner;

public class Tugas3_Jobsheet9_Array {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        boolean ketersediaan = false;

        String menu[] = {"Nasi Goreng", "Mie Goreng", "Roti Bakkar", 
                         "Kentang Goreng", "Teh Tarik", "Cappucino", 
                         "Chocolate Ice"};

        System.out.print("Masukkan keyword menu: ");
        String masukkan = sc12.nextLine();

        for (String item : menu) {
            if (masukkan.equalsIgnoreCase(item)) {
                ketersediaan = true;
                break; 
            }
        }

        if (ketersediaan) {
            System.out.println("Menu Tersedia");
        } else {
            System.out.println("Menu Tidak Tersedia");
        }

        
    }
}