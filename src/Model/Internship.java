package Model;

public class Internship extends Candidate {
	private String majors;
	private String semesters;
	private String nameUniversity;
	
	public Internship() {
		super();
	}

	public Internship(String majors, String semesters, String nameUniversity, String id, String firstName, String lastName, int birthDate, String address, String phone, String email, int typeCandidate) {
		super(id, firstName, lastName, birthDate, address, phone, email, typeCandidate);
		this.majors = majors;
		this.semesters = semesters;
		this.nameUniversity = nameUniversity;
	}

	public String getMajors() {
		return majors;
	}

	public void setMajors(String majors) {
		this.majors = majors;
	}

	public String getSemesters() {
		return semesters;
	}

	public void setSemesters(String semesters) {
		this.semesters = semesters;
	}

	public String getNameUniversity() {
		return nameUniversity;
	}

	public void setNameUniversity(String nameUniversity) {
		this.nameUniversity = nameUniversity;
	}
	
	
	
}
