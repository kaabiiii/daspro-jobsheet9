import java.util.Scanner;
public class SearchNilai12 {
    public static void main(String[] args) {

        Scanner sc12 = new Scanner (System.in);
       
            int key, jmlMhs;
            int hasil = -1, nilaiMhs;
            
            System.out.println("Masukkan jumlah mahasiswa ");
            jmlMhs = sc12.nextInt();
            int []arrNilai = new int [jmlMhs];
        
            for (int i = 0; i < arrNilai.length; i++) {
                System.out.println("Masukkan nilai mahasiswa ke-" + (i + 1));
                arrNilai[i]=sc12.nextInt();
               
            }     
            System.out.println("Masukkan nilai yang ingin dicari");
            key = sc12.nextInt();
                
            for (int i = 0; i < arrNilai.length; i++) {
                    if (key == arrNilai[i]) {
                        hasil = i;  
                        break; 
                    }
            }
                
             
                System.out.println();
                if (hasil != -1) {
                    System.out.println("Nilai " + key + " ketemu di indeks ke- " + (hasil+1));
                } else {
                    System.out.println("Nilai " + key + " yang dicari tidak ditemukan.");
                }
                System.out.println();
                
            
            }
        }
        
       
            
            
            


