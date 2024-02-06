/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalpbogame;

import java.io.File;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataSave {
    public void Simpan(String playerStatus, String HP, String ATK, String DEF) {
        try {
            File file = new File("AdventureText.dat");
            BufferedWriter output = new BufferedWriter(new FileWriter(file,true));
            String data = playerStatus + ":" + HP + ":" + ATK + ":" + DEF + ": \n";
            output.write(data);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public String Tampil() {
        StringBuilder content = new StringBuilder();
        try {
            File file = new File("AdventureText.dat");
            BufferedReader input = new BufferedReader(new FileReader(file));

            String line;
            while ((line = input.readLine()) != null) {
                content.append(line).append("\n");
            }
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}