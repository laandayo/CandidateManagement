package Model;

public class Experience extends Candidate {
	private int ExpInYear;
	private String ProSkill;
	
	public Experience() {
		super();
	}
	
	public Experience(int ExpInYear, String ProSkill, String id, String firstName, String lastName, int birthDate, String address, String phone, String email, int typeCandidate) {
		super(id, firstName, lastName, birthDate, address, phone, email, typeCandidate);
		this.ExpInYear = ExpInYear;
		this.ProSkill = ProSkill;
	}
	
	

	public int getExpInYear() {
		return ExpInYear;
	}

	public void setExpInYear(int ExpInYear) {
		this.ExpInYear = ExpInYear;
	}

	public String getProSkill() {
		return ProSkill;
	}

	public void setProSkill(String ProSkill) {
		this.ProSkill = ProSkill;
	}
	
	
}
