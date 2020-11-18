package polymorphismAndEncapsulation;

import java.util.Scanner;

	public class ProtonPersona extends Proton {
		
		String bigBoot;
		private String radio; //private data member
		private String key = "Key : Remote"; //can'change value which is remote
		
		ProtonPersona(){ //default constructor
			System.out.println("Please enter boot space : ");
			Scanner in = new Scanner(System.in);
			String boot = in.next();
			
			this.bigBoot = boot; //refer to object detail
		}
		 
		public void boots() {
			System.out.println("Boot space : " + bigBoot);
		}
		
		 //getter method for radio
		 public String getRadio() {
			 return radio;
		 }
		 
		 //setter method for radio
	     public void setRadio(String myradio) {
	    	 this.radio =myradio;
	     }
	     
	     //getter for key
	     public String getKey(){
	    	 return key;
	     }
        
	    //POLYMORPHISM
		void run()
		{
			System.out.println("Proton Persona is running safely");
		}

		
		}

		
		
