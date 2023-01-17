package entities;
import entities.Department;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Seller {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private int id;
	private String name;
	private String email;
	private Date Birthdate;
	private Department department;
}
