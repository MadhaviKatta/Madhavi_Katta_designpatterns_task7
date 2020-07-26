package eapmtask7.Designpatterns;
enum CarType 
{ 
    MICRO, MINI, LUXURY 
} 
  
abstract class Car 
{ 
    Car(CarType m, Location l) 
    { 
        this.m = m; 
        this.l = l; 
    } 
   
    abstract void construct(); 
   
    CarType m = null; 
    Location l = null; 
   
    CarType getModel() 
    { 
        return m; 
    } 
   
    void setModel(CarType m) 
    { 
        this.m = m; 
    } 
   
    Location getLocation() 
    { 
        return l; 
    } 
   
    void setLocation(Location location) 
    { 
        this.l = location; 
    } 
   
    public String toString() 
    { 
        return "CarModel - "+m + " located in "+l; 
    } 
} 
  
class LuxuryCar extends Car 
{ 
    LuxuryCar(Location location) 
    { 
        super(CarType.LUXURY, location); 
        construct(); 
    } 
    protected void construct() 
    { 
        System.out.println("Connecting to luxury car"); 
    } 
} 
  
class MicroCar extends Car 
{ 
    MicroCar(Location location) 
    { 
        super(CarType.MICRO, location); 
        construct(); 
    } 
    protected void construct() 
    { 
        System.out.println("Connecting to Micro Car "); 
    } 
} 
  
class MiniCar extends Car 
{ 
    MiniCar(Location loc) 
    { 
        super(CarType.MINI,loc ); 
        construct(); 
    } 
      
    void construct() 
    { 
        System.out.println("Connecting to Mini car"); 
    } 
} 
  
enum Location 
{ 
  DEFAULT, USA, INDIA 
} 
  
class INDIACarFactory 
{ 
    static Car buildCar(CarType model) 
    { 
        Car c = null; 
        switch (model) 
        { 
            case MICRO: 
                c = new MicroCar(Location.INDIA); 
                break; 
              
            case MINI: 
                c = new MiniCar(Location.INDIA); 
                break; 
                  
            case LUXURY: 
                c = new LuxuryCar(Location.INDIA); 
                break; 
                  
                default: 
                break; 
              
        } 
        return c; 
    } 
} 
  
class DefaultCarFactory 
{ 
    public static Car buildCar(CarType m) 
    { 
        Car c = null; 
        switch (m) 
        { 
            case MICRO: 
                c = new MicroCar(Location.DEFAULT); 
                break; 
              
            case MINI: 
                c = new MiniCar(Location.DEFAULT); 
                break; 
                  
            case LUXURY: 
                c = new LuxuryCar(Location.DEFAULT); 
                break; 
                  
                default: 
                break; 
              
        } 
        return c; 
    } 
} 
  
  
class USACarFactory 
{ 
    public static Car buildCar(CarType model) 
    { 
        Car c = null; 
        switch (model) 
        { 
            case MICRO: 
                c = new MicroCar(Location.USA); 
                break; 
              
            case MINI: 
                c = new MiniCar(Location.USA); 
                break; 
                  
            case LUXURY: 
                c = new LuxuryCar(Location.USA); 
                break; 
                  
                default: 
                break; 
              
        } 
        return c; 
    } 
} 
  
  
  
class CarFactory 
{ 
    private CarFactory()  
    { 
          
    } 
    public static Car buildCar(CarType type) 
    { 
        Car c = null; 
        // We can add any GPS Function here which 
        // read location property somewhere from configuration 
        // and use location specific car factory 
        // Currently I'm just using INDIA as Location 
        Location location = Location.INDIA;  
          
        switch(location) 
        { 
            case USA: 
                c = USACarFactory.buildCar(type); 
                break; 
                  
            case INDIA: 
                c = INDIACarFactory.buildCar(type); 
                break; 
                      
            default: 
                c = DefaultCarFactory.buildCar(type); 
  
        } 
          
        return c; 
  
    } 
} 
  
class Creational1  
{ 
    public static void main(String[] args) 
    { 
        System.out.println(CarFactory.buildCar(CarType.MICRO)); 
        System.out.println(CarFactory.buildCar(CarType.MINI)); 
        System.out.println(CarFactory.buildCar(CarType.LUXURY)); 
    } 
} 