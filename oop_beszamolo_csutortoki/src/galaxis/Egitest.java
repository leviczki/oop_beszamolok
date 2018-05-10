package galaxis;

public abstract class Egitest {
	
	private String egitest;
	
	public String getEgitest() {
		return egitest;
	}

	public Egitest(String egitest) {
		this.egitest = egitest;
	}
	
	public abstract float atszamit(int tomeg);

}
