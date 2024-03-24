/*Nurani Syahidah (2200462)*/

package tugaspertemuan6;

import java.util.Scanner; 

public class Tugaspertemuan6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Persegi Panjang ke-1");
        System.out.print("Masukkan panjang: ");
        int p1 = scanner.nextInt();
        System.out.print("Masukkan lebar: ");
        int l1 = scanner.nextInt();
        
        System.out.println("Persegi Panjang ke-2");
        System.out.print("Masukkan panjang: ");
        int p2 = scanner.nextInt();
        System.out.print("Masukkan lebar: ");
        int l2 = scanner.nextInt();

         System.out.println("Persegi Panjang ke-3");
        System.out.print("Masukkan panjang: ");
        int p3 = scanner.nextInt();
        System.out.print("Masukkan lebar: ");
        int l3 = scanner.nextInt();
        
        persegipanjang persegiPanjang1 = new persegipanjang(p1, l1);
        System.out.println("Persegi Panjang ke-1 : ");
        System.out.println("Panjang = " + persegiPanjang1.panjang);
        System.out.println("Lebar = " + persegiPanjang1.lebar);
        System.out.println("Keliling = " + persegiPanjang1.getKeliling());
        System.out.println("Luas = " + persegiPanjang1.getLuas()+ "\n");
        
        
        System.out.println("Persegi Panjang ke-2 : ");
        persegipanjang persegiPanjang2 = new persegipanjang(p2, l2);
        System.out.println("Panjang = " + persegiPanjang2.panjang);
        System.out.println("Lebar = " + persegiPanjang2.lebar);
        System.out.println("Keliling = " + persegiPanjang2.getKeliling());
        System.out.println("Luas = " + persegiPanjang2.getLuas()+ "\n");
        
        System.out.println("Persegi Panjang ke-3 : ");
        persegipanjang persegiPanjang3 = new persegipanjang(p3, l3);
        System.out.println("Panjang = " + persegiPanjang3.panjang);
        System.out.println("Lebar = " + persegiPanjang3.lebar);
        System.out.println("Keliling = " + persegiPanjang3.getKeliling());
        System.out.println("Luas = " + persegiPanjang3.getLuas());
    }
    
}