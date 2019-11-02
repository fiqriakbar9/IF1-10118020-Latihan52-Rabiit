/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rabbit;

/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk menampilkan Data kelinci
 * 
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Rabbit rebit = new Rabbit("Peter",false,"Grass",4,"grey");
       
        System.out.println("Hello, His name is "+rebit.getName());
        System.out.println("Peter is Vegetarian? "+rebit.vegetarian);
        System.out.println("Peter eats "+rebit.geEats());
        System.out.println("peter has "+rebit.getNoOfLegs()+" Legs.");
        System.out.println("Peter color is "+rebit.getColor());
        
        System.out.println("\nDevelop By : Fiqri Akbar Pratama");
        
    }
    
}
