/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;
import java.util.ArrayList;

/**
 *
 * @author Martwartz
 */
public class PostTest1 {
    
//    public class Baju {
//    public String merk;
//    public String ukuran;
//    public String warna;
//    public double harga;    
    
//    public Baju (String merk, String ukuran, String warna, double harga) {
//        this.merk = merk;
//        this.ukuran = ukuran;
//        this.warna = warna;
//        this.harga = harga;
//    
//    }
//    public String getmerk(){
//        return merk;
//    }
//    
//    public String getukuran(){
//        return ukuran;
//    }
//    
//    public String getwarna(){
//        return warna;
//    }
//    
//    public double getharga(){
//        return harga;
//    }
//    }
    public static void main(String[] args) {
    ArrayList <Baju> clothes = new ArrayList<> ();
        clothes.add(new Baju ("Adidas", "S", "Hijau", 25000));
        clothes.add(new Baju ("H&M", "XL", "Putih", 450000));
        clothes.add(new Baju ("Uniqlo", "XS", "Pink", 70000));
        clothes.add(new Baju ("Erigo", "M", "Merah", 890000));
        clothes.add(new Baju ("Polo", "L", "Hitam", 65000));
        
        for (Baju bajuu : clothes) {
            System.out.println("Baju " + bajuu.merk + " berukuran " + bajuu.ukuran + " dengan warna " + bajuu.warna + " harganya " + bajuu.harga + ".");
        }
    }
}
//    for (Baju baju : clothes){
//        System.out.println("Merk: "+ baju.getmerk());
//        System.out.println("Ukuran: "+ baju.getukuran());
//        System.out.println("Warna: "+ baju.getwarna());
//        System.out.println("Harga: "+ baju.getharga());  
//        System.out.println();
//    }     
//   }
//  }
    
    


