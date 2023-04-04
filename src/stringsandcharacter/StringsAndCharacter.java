
package stringsandcharacter;
import java.util.Scanner;
/**
 *
 * @author skubjana
 */
public class StringsAndCharacter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declare a Scanner
        Scanner scan = new Scanner(System.in);
        
        //Declare Variables
        String words;
        char letter;
        
        //Prompt the User for a String Value
        System.out.println("Enter a String");
        words = scan.nextLine();
        
        //Prompt the User for a Character Value
        System.out.println("Enter a Character");
        letter = scan.next().charAt(1);
        
        //Displaying Info to the User
        System.out.println("The String Value: " + words);
        System.out.println("The Character Value: " + letter);
    }
    
}
