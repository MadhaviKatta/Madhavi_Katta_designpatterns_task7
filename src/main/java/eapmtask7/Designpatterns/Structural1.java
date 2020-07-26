package eapmtask7.Designpatterns;
import java.lang.*;
import java.util.*;
interface AirTransport 
{ 
    public void fly(); 
    public void Time(); 
} 
  
class Aeroplane implements AirTransport 
{ 
    public void fly() 
    { 
        System.out.println("Flying"); 
    } 
    public void Time() 
    { 
        System.out.println("less time compare to road Transport"); 
    } 
} 
  
interface RoadTransport 
{ 
    public void fly();
} 
  
class C implements RoadTransport 
{ 
    public void fly() 
    { 
        System.out.println("cant fly"); 
    } 
} 
  
class B implements RoadTransport 
{ 
    AirTransport air; 
    public B(AirTransport air) 
    { 
        this.air = air; 
    } 
    public void fly() 
    { 
        System.out.println("cant fly"); 
    } 
  
   
} 
  
class Structural1 
{ 
    public static void main(String args[]) 
    { 
        Aeroplane aero = new Aeroplane(); 
        RoadTransport r = new C(); 
  
        RoadTransport b = new B(aero); 
  
        System.out.println("Aeroplane..."); 
        aero.fly(); 
        aero.Time(); 
  
        System.out.println("Car"); 
        r.fly(); 
   
        System.out.println("Bike"); 
        b.fly(); 
    } 
} 