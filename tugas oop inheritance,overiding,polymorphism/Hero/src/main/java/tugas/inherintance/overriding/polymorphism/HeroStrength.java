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
public class HeroStrength extends Hero{
    String type = "Strength";

    HeroStrength(String nameInput, double attackInput, double healthInput){
        super(nameInput, attackInput, healthInput);
    }

    @Override
    void Output(){
        super.Output();
        System.out.println("Type : " + type);
    }

    @Override
    void kerusakan(double kerusakan){
        System.out.println(name + " mengalami kerusakan sebesar : " + kerusakan + " -> " + 0.5*kerusakan);
        health = health - 0.5*kerusakan;
    }
}
