
package utsoop2022;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author I Ketut Agus Restu Wijaya 20103347
 */
public class Utsoop2022 {

    public static void main(String[] args) {
        ArrayList<String> coba= new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        int n = 0;
        do{
        System.out.println("==============Masukan Data Pengunjung==============");
        System.out.println("Tampilkan Data Pengunjung");
        System.out.println("Isi Data Pengunjung");
        System.out.println("Keluar");
        System.out.println("#####################################################");
        System.out.print("Pilih menu :");
        n = input.nextInt();
        
          
        if(n==1){
           
           System.out.println("Isi Data Nama Pengunjung Kebun Binatang");
           System.out.println();
           System.out.println();
           System.out.print("Masukan Nama    :");
           String nama=input.next();
           coba.add(nama);
            }
            else if (n==2){
            System.out.println("Isi Data Nama Pengunjung Kebun Binatang");
            System.out.println();
            System.out.println();
            System.out.print("Masukan Nama    :");
            String nama=input.next();
            coba.add(nama);
            }     
       
       System.out.println("----------------------");
        System.out.println(coba);
       System.out.println("Jumlah pengunjung adalah :"+coba.size());
        
       }while(n!=3);
    }
    
}
