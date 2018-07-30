package i.co.abinc.group;
//class to implement School entity
public class School {

	//Instance members
	private String name;
	private String city;
	private String school;
	private String schoolDistrict;
	private String greatSchoolRanking;
	
	//Parameterized Constructors
	public School(String name, String city, String schoolDistrict, String greatSchoolRanking) {
		this.name = name;
		this.city = city;
		this.schoolDistrict = schoolDistrict;
		this.greatSchoolRanking = greatSchoolRanking;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public String getSchool() {
		return school;
	}

	public String getDistrict() {
		return schoolDistrict;
	}

	public String getGreatSchoolRanking() {
		return greatSchoolRanking;
	}
	
}
