/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciologica01;

/**
 *
 * @author odavi
 */
public class ExercicioLogica01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, anos;
        double taxaA, taxaB;
        anos = 0;
        a = 80000;
        b = 200000;
        while(b >= a){
            a = a * 3;
            b = (int) (b * 1.5);
            anos++;
        }//fim do loop
        System.out.println("O país A levou "+anos+" anos "
                + "para ultrapassar o país B.");
        
        System.out.println("O país A tem "+a+" habitantes.");
        System.out.println("O país B tem "+b+" habitantes.");
    }
    
}
