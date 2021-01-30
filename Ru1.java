
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru1;

/**
 *
 * @author RUWAN RANAWEERA
 */
public class Ru1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        car y =new car("TOyota","red",5000);
//        
//        System.out.println(y.name);
//        System.out.println(y.color);
//        System.out.println(y.price);
//        
//        y.getdrive(1245, "ruwsan");
//        car k= new car("sdadsd","green",500);
//        System.out.println(k.name+ " " + k.color+ " " + k.price);
        
        car n =new car("ruwan","black");
        System.out.println(n.name);
        System.out.println(n.color);
        
//        System.out.println(n.name);
//        System.out.println(n.color);
//        System.out.println(n.price);
//        
//        car y = new car("Vizel","black",2500);
//        System.out.println(y.name);
        
    }
        // TODO code application logic here
    }
 
    
    
class car  {
      public String name;
     public String color;
    public int price;



//public car(String name,String color,int price){
//
//    this.name=name;
//    this.color=color;
//    this.price=price;
//  
//
//}
//
//car(){
//
//name="ruwan";
//color="white";
//price=1200;
//
//
//}
//
//void getdrive(int sucure_c, String owner)
//{
//    System.out.println("Calling");
//  
//}
    car(String name,String color){
        
        this.name=name;
        this.color=color;
    
    }
}
  


