package polymorphismAndEncapsulation;


public class mainProton {

	public static void main(String[] args) {
		
	
		ProtonSaga s = new ProtonSaga();
		System.out.println("\nProton Saga features :-");
		s.fuel();
		s.printProton();
		s.run(); //calling method POLYMOPHISM
		//METHOD OVERLOADING
		s.colour("Black");
		s.sum(35000, 40000);
		//ENCAPSULATION
	    s.setSeats("Seat : Leather");
		System.out.println(s.getSeat());
		System.out.println(s.getItem());
				
		ProtonPersona p= new ProtonPersona();
		System.out.println("\nProton Persona features :-");
		p.boots();
		p.printProton();
		p.run();//calling method POLYMORPHISM
		//METHOD OVERLOADING
		p.colour("Red");
		p.sum(90000,100000);
		//ENCAPSULATION
		p.setRadio("Radio : Kenwood"); //setting value of the name member
		System.out.println(p.getRadio());
		System.out.println(p.getKey());
		
		ProtonX70 p1= new ProtonX70();
		System.out.println("\nProton X70 features :-");
		//ENCAPSULATION
		p1.setPilot("Pilot : Auto Pilot");
		System.out.println(p1.getPilot());
		System.out.println(p1.getAirbag());
		p1.setTrans("Transmission : Dual Clutch ");
		System.out.println(p1.getTrans());
		p1.printProton();
		p1.run();//calling method POLYMORPHISM
	    //METHOD OVERLOADING
		p1.sum(20000,5000,700000);
		p1.colour("Grey");
		
		ProtonX50 p2= new ProtonX50();
		System.out.println("\nProton X50 features :-");
		//ENCAPSULATION
		p2.setPark("Parking : Auto Park");
		System.out.println(p2.getPark());
		System.out.println(p2.getInstrument());
		p2.setCamera("Camera : Reverse Camera");
		System.out.println(p2.getCamera());
		p2.printProton();
		//METHOD OVERLOADING
		p2.sum(79000, 85000, 103000); 
		p2.colour("White");
		p2.run();//calling method POLYMORPHISM
		p2.colour("White");
		
	}
	
	}


