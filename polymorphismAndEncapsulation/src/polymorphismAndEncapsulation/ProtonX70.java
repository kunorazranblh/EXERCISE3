package polymorphismAndEncapsulation;

public class ProtonX70 extends Proton {
	
	private String pilot;
	private String airBag = "Airbag : 6 SRS Airbag";
	private String transmission;
	
	public String getPilot() {
		return pilot;	
	}
	
	public void setPilot(String myautopilot) {
		this.pilot=myautopilot;
	}
	
	public String getAirbag() {
		return airBag;
	}
	
	public String getTrans() {
		return transmission;	
	}
	
	public void setTrans(String mytransmission) {
		this.transmission = mytransmission;
	}
	
	//POLYMORPHISM
	void run()
	{
		System.out.println("Proton X70 is running safely");
	}
 
}