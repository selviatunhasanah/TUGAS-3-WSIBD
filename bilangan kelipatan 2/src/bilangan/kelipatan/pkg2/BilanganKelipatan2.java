/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilangan.kelipatan.pkg2;

/**
 *
 * @author 
 */
public class BilanganKelipatan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int number = 1;

        System.out.println("         Do_While");
        System.out.println("Bilangan Kelipatan 2 (1-100)");
        System.out.println("============================");

        System.out.print("     " + number + " ");
        do {
            number *= 2;
            if (number > 100){
                break;
            }
            System.out.print(number + " ");
        } while (number < 100);
        System.out.println("");
    }
    
}
