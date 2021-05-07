package eTicaretUserManagementSys;

import java.util.ArrayList;

import eTicaretUserManagementSys.business.abstracts.UserService;
import eTicaretUserManagementSys.business.concretes.UserManager;
import eTicaretUserManagementSys.core.concretes.GoogleRegistrationManager;
import eTicaretUserManagementSys.core.utils.GoogleHelper;
import eTicaretUserManagementSys.dataAccess.concretes.InMemoryUserDao;
import eTicaretUserManagementSys.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User(1,"Ertugrul","Ozdemir","ertugrul@gmail.com","123ASbd1!");
		
		ArrayList<User> users = new ArrayList<User>();
		
		
		UserService userService= new UserManager(new InMemoryUserDao(users), new GoogleRegistrationManager());
		
		userService.register(user);
		userService.login("ertugrul@gmail.com", "123ASbd1",1);

	}

}
