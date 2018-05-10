package bank;

public class Card {
	
	private String tulajdonos;
	private int egyenleg;
	
	public Card(String tulajdonos, int egyenleg) {
		this.tulajdonos = tulajdonos;
		this.egyenleg = egyenleg;
	}

	public String getTulajdonos() {
		return tulajdonos;
	}

	public int getEgyenleg() {
		return egyenleg;
	}

	public void setEgyenleg(int egyenleg) {
		this.egyenleg = egyenleg;
	}

	public boolean penzFelvetel(int osszeg) {
		
		if((egyenleg - osszeg) >= 0) {
			egyenleg -= osszeg;
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		
		return "Tulajdonos: "+this.tulajdonos+", rendelkezesre allo egyenleg: "+this.egyenleg;
	}
}
