/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.inherintance.overriding.polymorphism;

/**
 *
 * @author HP
 */
// Ini Inheritance (SubClass)
public class HeroPower extends Hero{
    String type = "SuperPower";
    
    HeroPower(String nameInput, double attackInput, double healthInput){
	super(nameInput, attackInput, healthInput);
    }
    
   @Override
    void Output(){
        super.Output();
        System.out.println("Type : " + type);
    }
        
    @Override
    void Menyerang(Hero enemy){
        System.out.println("\n" + name + " menyerang " + enemy.name);
        enemy.kerusakan(attackPower*2);
    }
        
    @Override
    void kerusakan(double kerusakan){
        System.out.println(name + " mengalami kerusakan sebesar : " + kerusakan);
        health = health - kerusakan;   
    }
}