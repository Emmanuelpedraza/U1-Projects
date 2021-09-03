import java.util.Scanner;

public class MadLib {

    /*Create your own MadLibs. (https://www.madtakes.com/) You may use a story or example from the
    website if you don't wish to make up your own. This program must run entirely in the console.


     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String name1;
        String monster;
        String weapon;

        System.out.println("Pick a name ");
        name1 = read.next();

        System.out.println("Pick a monster");
        monster = read.next();

        System.out.println("Pick a weapon (anything)");
        weapon = read.next();


        System.out.println("hello , " + name1 + " We are in danger from " + monster + " and we need help, Choose your weapon. A " + weapon + " nice choice now LETS GOO!!");







    }
}