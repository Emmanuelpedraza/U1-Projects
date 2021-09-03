import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class RPGCharacter {

    /*Create a program that calculates an RPG Character's battle stats based on the character's physical stats.
    The physical and battle stat can be anything you wish provided it meets these criteria:

        The physical stats (Strength, Dexterity, Spirit etc ...) will be entered by the user
        The battle stats (damage, armor, mana capacity, spell strength ...) will be calculated based on the physical stats.

     We will continue to expand on this program throughout the year, so give it some thought. There should be some complexity.

     The program should run using dialog boxes and the output should show ALL the character's stats including a name.
     */

    public static void main(String[] args) {


        String Name = JOptionPane.showInputDialog("What is your Name?");
        double Strength = Double.parseDouble(JOptionPane.showInputDialog("What is your Strength Level (Roll of 20 )"));
        double Dexterity = Double.parseDouble(JOptionPane.showInputDialog("What is your Dexterity (Roll of 20 )"));
        double Wisdom = Double.parseDouble(JOptionPane.showInputDialog("What is your Wisdom ( Roll of 20)"));
        int Health = Integer.parseInt(JOptionPane.showInputDialog(" What is your Health ? (Roll of 20 "));


        double damage = Strength + Dexterity;
        double armor = Strength + Wisdom;
        double spellStrength = Strength + Wisdom;





        JOptionPane.showMessageDialog(null , " The STATS OF " + Name + " are, Health = " + Health + " Strength = " + Strength + ", Dexterity = " + Dexterity + ", Wisdom =" + Wisdom + " !!!" );
        JOptionPane.showMessageDialog(null, " Your damage amount is " + damage + " Your armor Is " + armor + " Your Spell strength is " + spellStrength );
        System.exit(0);









    }





}
