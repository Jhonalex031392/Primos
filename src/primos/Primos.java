/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primos;

/**
 *
 * @author acerpc
 */
public class Primos {

    
    public static void main(String[] args) {
        int a = 2;
        int b = 542;
        boolean Primo;
 
        for (int i = a; i <= b; i++) {
            Primo = true;
 
            for (int j = 2; j <= Math.sqrt(i) && Primo; j++) {
                if (i % j == 0) {
                    Primo = false;
                }
            }
 
            if (Primo) {
                System.out.println("Numero primo "+i);
            }
        }
    }
    
}
