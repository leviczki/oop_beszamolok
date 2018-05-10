package szgep;

public abstract class Adathordozo  {

	private String marka;
	private double kapacitas;
	
	public Adathordozo(String marka, double kapacitas) {
		this.marka = marka;
		this.kapacitas = kapacitas;
	}
	
	public String getMarka() {
		return marka;
	}
	public double getKapacitas() {
		return kapacitas;
	}
	
	public abstract double getSzabadHely();

	
	
		
}
