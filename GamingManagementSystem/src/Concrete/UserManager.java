package Concrete;

import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService{

	@Override
	public void add(User user) {
		if (user.getFirtsName().length() >= 2 && user.getLastName().length() >= 2 && user.getNationalyNumber().length() == 11) {
			System.out.println(user.getFirtsName() + " kullanicisi olusturuldu");
		}else {
			System.out.println("bilgiler eksik veya hatali");
		}
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirtsName() + " sistemden silindi");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirtsName() + " kullanicisi guncellendi");
		
	}

}
