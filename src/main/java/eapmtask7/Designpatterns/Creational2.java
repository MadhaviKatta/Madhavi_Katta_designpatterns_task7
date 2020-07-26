package eapmtask7.Designpatterns;
import java.lang.*;
class SO {

	   //create an object of SingleObject
	   private static SO i = new SO();

	   //make the constructor private so that this class cannot be
	   //instantiated
	   private SO(){}

	   //Get the only object available
	   public static SO getInstance(){
	      return i;
	   }

	   public void SM(){
	      System.out.println("Singleton");
	   }
	}
public class Creational2 {
	   public static void main(String[] args) {

	      //illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
	      //SingleObject object = new SingleObject();

	      //Get the only object available
	      SO object = SO.getInstance();

	      //show the message
	      object.SM();
	   }
	}