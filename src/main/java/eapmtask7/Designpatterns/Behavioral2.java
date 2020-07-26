package eapmtask7.Designpatterns;

import java.lang.*;
import java.util.*;
class Chain 
{ 
Processor ch; 
  
public Chain(){ 
    buildChain(); 
} 
  
private void buildChain(){ 
    ch = new NegativeProcessor(new ZeroProcessor(new PositiveProcessor(null))); 
} 
  
public void process(Number req) { 
    ch.process(req); 
} 
  
} 
  
abstract class Processor  
{  
    private Processor pr; 
  
    public Processor(Processor processor){ 
        this.pr = processor; 
    }; 
      
    public void process(Number req){ 
        if(pr != null) 
            pr.process(req); 
    };  
}  
  
class Number  
{  
    private int n;  
  
    public Number(int n)  
    {  
        this.n = n;  
    }  
  
    public int getNumber()  
    {  
        return n;  
    }  
  
}  
  
class NegativeProcessor extends Processor  
{  
    public NegativeProcessor(Processor processor){ 
        super(processor); 
          
    } 
  
    public void process(Number req)  
    {  
        if (req.getNumber() < 0)  
        {  
            System.out.println("NegativeProcessor : " + req.getNumber());  
        }  
        else
        {  
            super.process(req);  
        }  
    }  
}  
  
class ZeroProcessor extends Processor  
{  
    public ZeroProcessor(Processor processor){ 
        super(processor); 
    } 
  
    public void process(Number req)  
    {  
        if (req.getNumber() == 0)  
        {  
            System.out.println("ZeroProcessor : " + req.getNumber());  
        }  
        else
        {  
            super.process(req);  
        }  
    }  
}  
  
class PositiveProcessor extends Processor  
{  
  
    public PositiveProcessor(Processor processor){ 
        super(processor); 
    } 
  
    public void process(Number r)  
    {  
        if (r.getNumber() > 0)  
        {  
            System.out.println("PositiveProcessor : " + r.getNumber());  
        }  
        else
        {  
            super.process(r);  
        }  
    }  
}  
  
class Behavioral2  
{  
    public static void main(String[] args) {  
        Chain c = new Chain(); 
          
        //Calling chain of responsibility  
        c.process(new Number(77));  
        c.process(new Number(-87));  
        c.process(new Number(0));  
        c.process(new Number(64));  
    }  
}  
