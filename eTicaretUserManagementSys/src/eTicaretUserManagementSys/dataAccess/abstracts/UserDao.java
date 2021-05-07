package eTicaretUserManagementSys.dataAccess.abstracts;

import java.util.List;

import eTicaretUserManagementSys.entities.concretes.User;

public interface UserDao {
	void register(User user);
	void login(User user);
	void delete(User user);
	List<User> getAll();
	User getByEmail(String email);

}
