import javax.swing.*;
import java.sql.SQLOutput;

public class Sales {

    /*Write a program, using dialog boxes, which prompts the user to enter a quantity, price, discount(as an integer) and sales tax(as an integer).
    The program should output the subtotal, tax total and total cost. Output should have proper currency format and proper rounding.

    Hint: You can use \n inside a String literal to make a new line, helpful for the dialog box output.

    Example:

    What is the sale price?: 4.99
    What is the discount?: 10
    How many are you buying?: 5
    What is the sales tax?: 7

    Subtotal: $22.46
    Tax Total: $1.57
    Total Cost: $24.03
     */

    public static void main(String[] args) {

        String inputString;


        double price = Double.parseDouble(JOptionPane.showInputDialog("What is the price  of the item ?"));
        int discount = Integer.parseInt(JOptionPane.showInputDialog("What is the discount ? "));
        int quantity = Integer.parseInt(JOptionPane.showInputDialog("How many are you buying ?"));
        int saleTax = Integer.parseInt(JOptionPane.showInputDialog(" How much is tax ?"));


        double TAX = saleTax/100.0;
        double flatTotal = price * quantity;
        double Dis = discount/100.0;
        double disPrice = flatTotal * Dis;
        double subTotal = flatTotal - disPrice;
        double taxTotal = subTotal * TAX;
        double totalCost = subTotal + taxTotal;







        JOptionPane.showMessageDialog(null,"Subtotal = $" + subTotal + "\nTax Total = $" + taxTotal + " , " + totalCost);











    }
}
