/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalpbogame;

/**
 *
 * @author User
 */
public class PlayerStatus {
    private String playerName;
    public int HPSorc = 15;
    public int ATKSorc = 12;
    public int DEFSorc = 5;
    public int HPBard = 15;
    public int ATKBard = 10;
    public int DEFBard = 7;
    public int HPBarb = 20;
    public int ATKBarb = 10;
    public int DEFBarb = 5;
    
    
    public PlayerStatus(String playerName) {
        this.playerName = playerName;
    }
    
    public void chooseSorcerer() {
        playerName = "Sorcerer";
        int sorcererAtk = ATKSorc + 3;
    }
    
    public void chooseBard() {
        playerName = "Bard";
        int bardDef = DEFBard + 2;
    }
    
    public void chooseBarbarian() {
        playerName = "Barbarian";
        int barbarianHP = 20;
    }
    
    public String getPlayerName() {
        return playerName;
    }
    
    // Sorcerer
    
    public int getHPSorc() {
        return HPSorc;
    }
    
    public int getATKSorc() {
        return ATKSorc;
    }
    
    public int getDEFSorc() {
        return DEFSorc;
    }
    
    // Bard
    
    public int getHPBard() {
        return HPBard;
    }
    
    public int getATKBard() {
        return ATKBard;
    }
    
    public int getDEFBard() {
        return DEFBard;
    }
    
    // Barbarian
    
    public int getHPBarb() {
        return HPBarb;
    }
    
    public int getATKBarb() {
        return ATKBarb;
    }
    
    public int getDEFBarb() {
        return DEFBarb;
    }
    
}
