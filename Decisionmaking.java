/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.decisionmaking;

/**
 *
 * @author user
 */
public class Decisionmaking {

    public static void main(String[] args) {
        //if...else statment//
        int nilai = 70;
        
        if(nilai > 80 ){
        System.out.println("selamat anda lulus");
        
        }else if(nilai < 80 ){
        System.out.println("anda tidak lulus");
        
        }else if(nilai == 80){   
        System.out.println("pas kkm");
        }
        
        //if statment//
        int score = 60;
        
      if( nilai > 80 ) {
         System.out.print("selamat anda lulus");
         
      }else {
         System.out.print("anda tidak lulus");
         
         
         
        //switch statment//
      char peringkat = '4';

      switch(peringkat) {
         case '1' :
            System.out.println("sangat bagus!"); 
            break;
         case '2' :
            System.out.println("cukup bagus");
            break;
         case '3' :
            System.out.println("bagus");
         case '4' :
            System.out.println("mengulang kelas");
            break;
         default :
            System.out.println("peringkat belum ter data");
      }
      System.out.println("peringkat kamu adalah " + peringkat);
      
      //nested if//
      byte angka1 = 70;
        byte angka2 = 40;
        byte angka3 = 45;
        if (angka1 >= 70 && angka2 >= 40){
            System.out.println("kerja bagus, anda lulus");
            if (angka3 == 45);{
                System.out.println("nilai pas rata-rata");
            }
        }
      }
   }
}
