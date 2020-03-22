/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;
import java.util.Scanner;

/**
 *
 * @author Arief
 */
public class Makananan {
   
    
    static void Makanan() {
        Scanner scan = new Scanner(System.in);
        int harga = 0;
//        inisialisasi harga ketiga menu
        int h1 = 5000, h2 = 4500, h3 = 4000;
        String menu;

        for (String i = "Y"; i.equals("Y")||i.equals("y"); )
        {
        System.out.println("___________________________________________________________________");
//        pengguna memasukkan nomor pesanan
        System.out.print("Masukkan Nomor Pesanan : ");
        int inNomor = scan.nextInt();
        System.out.println("___________________________________________________________________");

        if (inNomor == 1)
        {
//            jika nomor satu, maka menu yang dipilih adalah batagor, dan harganya adalah h1, yang merupakan harga menu pertama
            menu = " Burger";
            System.out.println("Pilihan anda nomor " +inNomor + menu);
            
            harga = harga + h1;
        }
            else if (inNomor == 2)
            {
//            jika nomor dua, maka menu yang dipilih adalah kupat tahu, dan harganya adalah h2, yang merupakan harga menu kedua
                menu = " Pizza Slice";
                System.out.println("Pilihan anda nomor " +inNomor + menu);
                harga = harga + h2;
            }
                else if (inNomor == 3)
                {
//            jika nomor tiga, maka menu yang dipilih adalah lontong kari, dan harganya adalah h3, yang merupakan harga menu ketiga
                    menu = " Kentang Goreng";
                    System.out.println("Pilihan anda nomor " +inNomor + menu);
                    harga = harga + h3;
                }
                
                
                     else
//            jika selain nomor satu sampai tiga, maka akan ditampilkan "Nomor yang dipilih tidak ada di menu."
                    {
                        System.out.println("Nomor yang dipilih tidak ada di menu.");
                    }

//            User diperintahkan untuk memasukkan data apakah dia akan melanjutkan atau tidak
            System.out.println("Apakah anda mau melanjutkan? Y/T");
            i = scan.next();

        }
        System.out.println("___________________________________________________________________");
        System.out.println("Total pembayaran sebesar " +harga+".");
        System.out.println("Terimakasih atas kunjungannya.");
    }
}
    
        // TODO code application logic here
  