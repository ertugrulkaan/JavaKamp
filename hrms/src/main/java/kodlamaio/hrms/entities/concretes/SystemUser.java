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
@Table(name="system_users")
public class SystemUser {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")	
	private int id;
	@Column(name="user_id")	
	private int userId;
	@Column(name="roles")	
	private String roles;
	
	public SystemUser() {
		
	}
	public SystemUser(int id, int userId, String roles) {
		super();
		this.id = id;
		this.userId = userId;
		this.roles = roles;
	}
}
