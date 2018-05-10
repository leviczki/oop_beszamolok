package bank;

public class CreditCard extends Card {
	
	private int hitelkeret;
	
	public CreditCard(String tulajdonos, int egyenleg) {
		super(tulajdonos, egyenleg);
		this.hitelkeret = 100000;
	}
	
	public CreditCard(String tulajdonos, int egyenleg, int hitelkeret) {
		super(tulajdonos, egyenleg);
		this.hitelkeret = hitelkeret;
	}
	
	@Override
	public boolean penzFelvetel(int osszeg) {
		
		if((super.getEgyenleg() - osszeg) >= 0) {
			
			super.setEgyenleg(super.getEgyenleg()-osszeg);
			return true;
			
		} else if((hitelkeret - osszeg) >= 0) {
				
				hitelkeret -= osszeg;
				return true;
				
		}
		
		return false;
	}

	public int getHitelkeret() {
		return hitelkeret;
	}

	public void setHitelkeret(int hitelkeret) {
		this.hitelkeret = hitelkeret;
	}
	
	@Override
	public String toString() {
	
		return "Tulajdonos: "+super.getTulajdonos()+", rendelkezesre allo egyenleg: "+super.getEgyenleg()+", hitelkeret: "+this.hitelkeret;
	}
	
}
