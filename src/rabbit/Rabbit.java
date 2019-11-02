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
public class Rabbit extends Animal {

    private String color;
    private String name;
    
    
    public Rabbit(String name, boolean veg, String food, int legs, String color){
      super(veg, food, legs);
      this.name = name;
      this.vegetarian = veg;
      this.eats = food;
      this.noOfLegs = legs;
      this.color = color;  
    
    }

    public String getColor(){
        return color;        
    }
    
    public String getName(){
        return name;        
    }
}
