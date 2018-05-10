package galaxis;

public class Bolygo extends Egitest {
	
	private float keringesi_ido;//ev
	private int atmero;//km
	
	//0 VENUS, 1 MARS, 2 JUPITER, 3 SATURN, 4 URANUS, 5 NEPTUNE
	static double konstansok[] = new double[]{ 0.78, 0.39, 2.65, 1.17, 1.05, 1.23 };
	
	public Bolygo(String egitest, float keringesi_ido, int atmero) {
		super(egitest);
		this.keringesi_ido = keringesi_ido;
		this.atmero = atmero;
		
		
	}
	
	////////////////////////////////
	
	public String toString() {
		return "Bolygo [keringesi_ido=" + keringesi_ido + ", atmero=" + atmero
				+ ", getEgitest()=" + getEgitest() + "]";
	}
	public float getKeringesi_ido() {
		return keringesi_ido;
	}
	public int getAtmero() {
		return atmero;
	}
	
	////////////////////////////////
	
	public float atszamit(int foldi_tomeg) {
		
		switch(this.getEgitest()) {
			case "Venus": 
				return (float) (foldi_tomeg*konstansok[0]);
			case "Mars": 
				return (float) (foldi_tomeg*konstansok[1]);
			case "Jupiter": 
				return (float) (foldi_tomeg*konstansok[2]);
			case "Saturn": 
				return (float) (foldi_tomeg*konstansok[3]);
			case "Uranus": 
				return (float) (foldi_tomeg*konstansok[4]);
			case "Neptune": 
				return (float) (foldi_tomeg*konstansok[5]);

		}
		
		return foldi_tomeg;
	}
	
	////////////////////////////////
	
	public boolean atmeroOsszehas(Bolygo x) {
		if(this.atmero > x.getAtmero())
			return true;
		
		return false;
	}
	
	public static Bolygo rovidebbKeringesiIdo(Bolygo x, Bolygo y) {
		if(y.getKeringesi_ido() < x.getKeringesi_ido())
			return y;
		
		return x;
	}

}
