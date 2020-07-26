package eapmtask7.Designpatterns;

import java.lang.*;
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader; 


interface FlowerShop 
{  
    public void Flowercolour();  
    public void price();  
}  
class Rose implements FlowerShop {   
    public void Flowercolour() {  
        System.out.println(" Red Colour");  
    }   
    public void price() {  
    System.out.println(" Rs 80 ");  
    }  
} 
class Jasmine implements FlowerShop {  
    public void Flowercolour() {  
    System.out.println(" White Colour ");  
    }   
    public void price() {  
        System.out.println(" Rs 120 ");  
    }  
}  
class Lotus implements FlowerShop {   
    public void Flowercolour() {  
    System.out.println(" Pink Colour ");  
    }   
    public void price() {  
        System.out.println(" Rs 550 ");  
    }  
}  
class ShopKeeper {  
    private FlowerShop rose;  
    private FlowerShop jasmine;  
    private FlowerShop lotus;  
      
    public ShopKeeper(){  
        rose= new Rose();  
        jasmine=new Jasmine();  
        lotus=new Lotus();  
    }  
    public void RoseSale(){  
        rose.Flowercolour();  
        rose.price();  
    }  
        public void JasmineSale(){  
        jasmine.Flowercolour();  
        jasmine.price();  
    }  
   public void LotusSale(){  
    lotus.Flowercolour();  
    lotus.price();  
        }  
}  
 
  
class Structure2 {  
    private static int  c;  
    public static void main(String args[]) throws NumberFormatException, IOException{  
        do{       
            System.out.print("========= Flower Shop ============ \n");  
            System.out.print("            1. Rose.              \n");  
            System.out.print("            2. Jasmine.              \n");  
            System.out.print("            3. Lotus.            \n");  
            System.out.print("            4. Exit.                     \n");  
            System.out.print("Enter your choice: ");  
              
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
            c=Integer.parseInt(br.readLine());  
            ShopKeeper sk=new ShopKeeper();  
              
            switch (c) {  
            case 1:  
                {   
                  sk.RoseSale();  
                    }  
                break;  
       case 2:  
                {  
                  sk.JasmineSale();        
                    }  
                break;    
       case 3:  
                           {  
                           sk.LotusSale();       
                           }  
                   break;     
            default:  
            {    
                System.out.println("Nothing You purchased");  
            }         
                return;  
            }  
              
      }while(c!=4);  
   }  
}  