package eTicaretUserManagementSys.business.abstracts;

import eTicaretUserManagementSys.entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(String email,String password,int logintype);
	void delete(User user);
	User getByEmail(String email);
}
