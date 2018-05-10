package szgep;

public class Merevlemez extends Adathordozo implements Comparable<Merevlemez> {

	private double foglalt_terulet;
	
	public Merevlemez(String marka, double kapacitas, double foglalt_terulet) {
		super(marka, kapacitas);
		this.foglalt_terulet = foglalt_terulet;
	}

	public double getFoglalt_terulet() {
		return foglalt_terulet;
	}

	@Override
	public double getSzabadHely() {
		return (super.getKapacitas()-this.getFoglalt_terulet());
	}

	@Override
	public String toString() {
		return "Marka: "+getMarka()+" kapacitas: "+getKapacitas()+" fogalt terulet: "+getFoglalt_terulet()+" szabad hely: "+getSzabadHely();
	}
	
	@Override
	public int compareTo(Merevlemez x) {
		return (int)(this.getSzabadHely() - x.getSzabadHely());
	}
	
	public boolean hasonlit(Merevlemez masik) {
		if(masik.getSzabadHely() < this.getSzabadHely())
			return true;
		
		return false;
	}
	
	public static Merevlemez nagyobbKapacitasu(Merevlemez a, Merevlemez b) {
		if(a.getKapacitas() > b.getKapacitas())
			return a;
		else
			return b;

	}
	
	public static Merevlemez hasonlitSzabadTerulet (Merevlemez a, Merevlemez b) {
		if(a.getSzabadHely() > b.getSzabadHely())
			return a;
		else
			return b;
	}
	

}
