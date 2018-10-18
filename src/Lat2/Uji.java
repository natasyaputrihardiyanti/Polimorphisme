/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat2;

/**
 *
 * @author acer
 */
public class Uji {
   
    

    public static void main (String []args){
        Line halo = new Line(1, 2, 3, 4);
        
        System.out.println(halo.getLength());
        System.out.println(halo.isGreater(halo, halo));
        System.out.println(halo.isLess(halo, halo));
        System.out.println(halo.isEqual(halo, halo));
        
        
        
    }
}