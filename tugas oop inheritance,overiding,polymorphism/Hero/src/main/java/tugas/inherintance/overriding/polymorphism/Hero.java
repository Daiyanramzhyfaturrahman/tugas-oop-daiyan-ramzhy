/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tugas.inherintance.overriding.polymorphism;

/**
 *
 * @author HP
 */
// Ini Inheritance (SuperClass)
public class Hero {
    String name;
    double attackPower, health;

    Hero(String nameInput, double attackInput, double healthInput){
        name = nameInput;
        attackPower = attackInput;
        health = healthInput;
    }

    void Menyerang(Hero enemy){
        System.out.println("\n" + name + " menyerang " + enemy.name);
        enemy.kerusakan(attackPower);
    }

    void kerusakan(double kerusakan){
        System.out.println(name + " mengalami kerusakan sebesar : " + kerusakan);
        health = health - kerusakan;
    }

    void Output(){
        System.out.println("\nName: " + name);
        System.out.println("Health: " + health);
        System.out.println("Power: " + attackPower);
    }
}