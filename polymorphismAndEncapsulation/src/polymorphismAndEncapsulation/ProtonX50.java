package polymorphismAndEncapsulation;


public class ProtonX50 extends ProtonX70{
	
	private String park;
	private String instrument = "Instrument : Digital instrument cluster";
	private String camera;
	
	public String getPark() {
		return park;
	}
	
	public void setPark(String mypark) {
		this.park=mypark;
	}
	
	 public String getInstrument(){
    	 return instrument;
     }

	 public String getCamera() {
			return camera;
		}
		
		public void setCamera(String mycamera) {
			this.camera=mycamera;
		}
	
    //POLYMORPHISM
	void run()
	{
		System.out.println("Proton X50 is running safely");
		super.run();
	}
}
