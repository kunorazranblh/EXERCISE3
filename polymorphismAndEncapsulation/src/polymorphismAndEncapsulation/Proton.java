package polymorphismAndEncapsulation;

public class Proton {

	 String brands, windows, headlight;
	  int tyreSize;
	  
	   Proton(){
		   this.brands="Dunlop";
		   this.tyreSize= 18;
	   }
	   
	   Proton (String w, String h){
		   this.windows=w;
		   this.headlight=h;	   
	   }
	   
	   public void printProton() {
	   
		Proton obj1= new Proton ();
		Proton obj2= new Proton("Up", "On");
		Proton obj3= new Proton("Down", "Off");
		
		System.out.println("Tyre brand : " + obj1.brands + "\nTyre size : " + obj1.tyreSize);
		System.out.println("Windows : " + obj2.windows + "\nHeadlight : " +obj2.headlight);
		System.out.println("Windows : " + obj3.windows + "\nHeadLight : " +obj3.headlight);
	  
	}
	   
	  //METHOD OVERLOADING
	   //same method as POLYMORPHISM
	   //but in method overloading can use same variable but different parameter
	   void sum(int base, long standard)
	   {
		   System.out.println("Price : " + ( base+standard));
	   }
	   
	   //same name but different parameter
	   void sum(int base, int executive, int premium)
	   {
		   System.out.println("Price : " + ( base+executive+premium));
	   }
	   
	   void colour(String colour) 
	   {
		   
		   System.out.println("Colour : " + colour);
	   }
	   //defining a method for POLMORPHISM
	   void run() {
		   System.out.println("Vehicle is running");
	   }
	}
