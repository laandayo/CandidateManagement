package Model;

public class Fresher extends Candidate {
	private String Graduation_date;
	private String Graduation_rank;
	private String education;
	
	public Fresher() {
		super();
	}

	public Fresher(String Graduation_date, String Graduation_rank, String education, String id, String firstName, String lastName, int birthDate, String address, String phone, String email, int typeCandidate) {
		super(id, firstName, lastName, birthDate, address, phone, email, typeCandidate);
		this.Graduation_date = Graduation_date;
		this.Graduation_rank = Graduation_rank;
		this.education = education;
		
	}

	public String getGraduation_date() {
		return Graduation_date;
	}

	public void setGraduation_date(String Graduation_date) {
		this.Graduation_date = Graduation_date;
	}

	public String getGraduation_rank() {
		return Graduation_rank;
	}

	public void setGraduation_rank(String Graduation_rank) {
		this.Graduation_rank = Graduation_rank;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}
	
	
	
	
}
