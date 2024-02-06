/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalpbogame;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ASUS
 */
class Character {
    String name;
    int ATK;
    int DEF;
    int HP;

    public Character(String name, int HP, int ATK, int DEF) {
        this.name = name;
        this.HP = HP;
        this.ATK = ATK;
        this.DEF = DEF;
    }

    Character(String enemy, int RandomEnemy) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for ATK
    public int getATK() {
        return ATK;
    }

    // Getter for DEF
    public int getDEF() {
        return DEF;
    }

    // Getter for HP
    public int getHP() {
        return HP;
    }
    
    public int attack(Character opponent) {
        int damage = Math.max(0, ATK - opponent.DEF);
        opponent.HP -= damage;
        return damage;
    }

    public boolean isAlive() {
        return HP > 0;
    }
}
