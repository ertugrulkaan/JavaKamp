package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="employers")
public class Employer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")	
	private int id;
	@Column(name="user_id")	
	private int userId;
	@Column(name="company_name")	
	private String companyName;
	@Column(name="website")	
	private String website;
	@Column(name="phone")	
	private String phoneNumber;
	@Column(name="is_verified")	
	private boolean isVerified;
	public Employer() {
		
	}
	public Employer(int id, int userId, String companyName, String website, String phoneNumber, boolean isVerified) {
		super();
		this.id = id;
		this.userId = userId;
		this.companyName = companyName;
		this.website = website;
		this.phoneNumber = phoneNumber;
		this.isVerified = isVerified;
	} 
}
