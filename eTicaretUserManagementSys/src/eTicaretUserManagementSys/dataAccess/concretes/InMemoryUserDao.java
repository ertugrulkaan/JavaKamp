package eTicaretUserManagementSys.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaretUserManagementSys.dataAccess.abstracts.UserDao;
import eTicaretUserManagementSys.entities.concretes.User;

public class InMemoryUserDao implements UserDao{

private ArrayList<User> users;
	
	public InMemoryUserDao(ArrayList<User> users) {
		this.users = users;
	}
	
	@Override
	public void register(User user) {
		users.add(user);
		System.out.println("Kullanici eklendi : " + user.getFirstName());
		
	}

	@Override
	public void login(User user) {
		for (User user2 : users) {
			if(user.getEmail() == user2.getEmail() && user.getPassword() == user2.getPassword()) {
				System.out.println("giris basarili");
				return;
			}
		}
		System.out.println("giris basarisiz");
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getByEmail(String email) {
		for (User user2 : users) {
			if(email == user2.getEmail()) {
				return user2;
			}
		}
		return null;
	}

	@Override
	public void delete(User user) {
		for (User user2 : users) {
			users.remove(user);
			if(user.getEmail() == user2.getEmail()) {
				System.out.println("kullanici silindi");
				return;
			}
		}
		System.out.println("kullanici bulunamadi");
		
	}

}
