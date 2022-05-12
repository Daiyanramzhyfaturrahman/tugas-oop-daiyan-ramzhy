/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.inherintance.overriding.polymorphism;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class TugasMain {
    /**
     * @param args the command line arguments
     */
    public static void main() {
        Hero hero1 = new Hero("Gundala",10,100);
	HeroStrength hero2 = new HeroStrength("Wiro Sableng", 20, 100);
        //polymorphism
        Hero hero3 = new HeroPower("Gatot Kaca", 15,100);
       
        
        Hero[] KumpulanHero = new Hero[3];
        KumpulanHero[0] = hero1;
        KumpulanHero[1] = hero2;
        KumpulanHero[2] = hero3;    
        
        System.out.print("\n" + "PILIHAN HERO :");    
        KumpulanHero[0].Output();
	KumpulanHero[1].Output();
	KumpulanHero[2].Output();
        
        System.out.print("\n" + "Serangan :"); 
        hero1.Menyerang(hero3);   
        hero3.Menyerang(hero1);   
        hero2.Menyerang(hero1);
       
        
        System.out.print("\n" + "Kondisi Hero Setelah Serangan :");
        KumpulanHero[0].Output();
        KumpulanHero[1].Output();
        KumpulanHero[2].Output();
    }
}