package polymorphismAndEncapsulation;

public class ProtonSaga extends Proton {

	 private String seats;
	    private String item = "Tinted Glass Windows";

		public static void fuel() {
			System.out.println("Fuel consumption\n");
		}
		
		//getter method for Seats
			 public String getSeat() {
				 return seats ;
			 }
			 
			 //setter method for Seats
		     public void setSeats(String mySeats) {
		    	 this.seats =mySeats;
		     }
		     
		     //getter for Item
		     public String getItem(){
		    	 return item;
		     }

    //POLYMORPHISM
	void run()
	{
		System.out.println("Proton Saga is running safely");
	}
}
