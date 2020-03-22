/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author Arief
 */
public class daftarmakanan {
    public static void main(String[] args) {
        burger Burger = new burger();
        burger kentang  = new burger();
        burger pizza = new burger();
        burger softdrink = new burger();
        burger airmineral = new burger();
        
       Burger.isiharga(5000);
       kentang.isiharga(8000);
       pizza.isiharga(22000);
       softdrink.isiharga(4500);
       airmineral.isiharga(4000);
        
        System.out.println("Burger Rp :"+Burger.burger());
        System.out.println("Kentang Goreng Rp :"+kentang.burger());
        System.out.println("pizza Rp :"+pizza.burger());
        System.out.println("softdrink Rp :"+softdrink.burger());
        System.out.println("air mineral Rp :"+airmineral.burger());
    }
    
}
