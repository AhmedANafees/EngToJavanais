
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nafea8846
 */
public class Javanais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String translate = "";
        word = word.toLowerCase();
        for (int i = 0; i < word.length() - 1; i++) {
            char letter1 = word.charAt(i);
            char letter2 = word.charAt(i + 1);

            if ((letter2 == 'a' || letter2 == 'u' || letter2 == 'o' || letter2 == 'i' || letter2 == 'e') && letter1 != 'a' && letter1 != 'u' && letter1 != 'i' && letter1 != 'e' && letter1 != 'o') {
                translate = translate + letter1 + "av";
            } else {
                translate = translate + letter1;
            }
        }
        translate = translate + word.charAt(word.length() - 1);
        System.out.println(translate);
    }
}
