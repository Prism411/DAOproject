package entities;
import entities.Department;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Seller {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private int id;
	private String name;
	private String email;
	private Date Birthdate;
	private Department department;
	
	
	public SimpleDateFormat getSdf() {
		return sdf;
	}
	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthdate() {
		return Birthdate;
	}
	public void setBirthdate(Date birthdate) {
		Birthdate = birthdate;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Birthdate, department, email, id, name, sdf);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		return Objects.equals(Birthdate, other.Birthdate) && Objects.equals(department, other.department)
				&& Objects.equals(email, other.email) && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(sdf, other.sdf);
	}
	public Seller(SimpleDateFormat sdf, int id, String name, String email, Date birthdate, Department department) {
		super();
		this.sdf = sdf;
		this.id = id;
		this.name = name;
		this.email = email;
		Birthdate = birthdate;
		this.department = department;
	}
	
	
	
	

}
