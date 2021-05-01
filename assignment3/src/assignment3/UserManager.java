package assignment3;

public class UserManager {
	public void logIn(User user) {
		System.out.println(user.getId() + " giriş yaptı!");
	}
	public void logOut(User user) {
		System.out.println(user.getId() + " çıkış yaptı!");
	}

	public void register(User user) {
		   System.out.println(user.getId() + " kayıt oldu!");
	}
}
