package oopHomeWork.entities;

public class Instructor {
	private int Id;
	private String FirstName;
	private String LastName;
	private String NationalityId;
	
	public Instructor(int id, String firstName, String lastName, String nationalityId) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		NationalityId = nationalityId;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getNationalityId() {
		return NationalityId;
	}

	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
	
}
