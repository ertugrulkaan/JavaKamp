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
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")	
	private int id;
	@Column(name="email")	
	private String email;
	@Column(name="password")	
	private String password;
	@Column(name="is_email_confirmed")	
	private boolean isEmailConfirmed;
	
	public User() {
		
	}
	
	public User(int id, String email, String password, boolean isEmailConfirmed) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.isEmailConfirmed = isEmailConfirmed;
	}
}
