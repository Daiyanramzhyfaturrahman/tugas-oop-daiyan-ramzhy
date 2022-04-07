/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mengenal_tentang_daiyan;


class introducing{
    String nama;
    String hobi;
    Byte umur;
    String status;
    String ttl;

}

public class Mengenal_tentang_daiyan {


public static void main(String[] args) {
        // TODO code application logic here
        introducing myself = new introducing();
        myself.nama = "daiyan ramzhy faturrahman";
        myself.umur = 19;
        myself.hobi = "berenang";
        myself.status = "mahasiswa";
        myself.ttl = "jakarta 26-12-2001";
        
        
        System.out.println("Nama : " + myself.nama);
        System.out.println("Umur : " + myself.umur);
        System.out.println("Hobi : " + myself.hobi);
        System.out.println("status : " + myself.status);
        System.out.println("ttl : " + myself.ttl);
        
        
        
    }
    
}