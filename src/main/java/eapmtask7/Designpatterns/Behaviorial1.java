package eapmtask7.Designpatterns;
import java.lang.*;

import java.util.List; 
import java.util.ArrayList; 
  
class lc 
{ 
    private String t; 
   
    public void set(String t)  
    { 
        System.out.println("Setting time to " + t); 
        this.t = t; 
    } 
   
    public Memento saveToMemento()  
    { 
        System.out.println("Saving time to Memento"); 
        return new Memento(t); 
    } 
   
    public void restoreFromMemento(Memento m)  
    { 
        t = m.getSavedTime(); 
        System.out.println("Time restored from Memento: " + t); 
    } 
   
    public static class Memento  
    { 
        private final String t; 
   
        public Memento(String ts)  
        { 
            t = ts; 
        } 
   
        public String getSavedTime()  
        { 
            return t; 
        } 
    } 
} 
  
class Behaviorial1  
{ 
      
    public static void main(String[] args)  
    { 
          
        List<lc.Memento> st = new ArrayList<lc.Memento>(); 
   
        lc l = new lc(); 
   
        //time travel and record the eras 
        l.set("100 B.C."); 
        st.add(l.saveToMemento()); 
        l.set("300 A.D."); 
        st.add(l.saveToMemento()); 
        l.set("250 A.D."); 
        st.add(l.saveToMemento()); 
        l.set("550 A.D."); 
   
        l.restoreFromMemento(st.get(0));    
   
    } 
} 