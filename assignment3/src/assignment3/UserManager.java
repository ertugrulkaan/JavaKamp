package assignment3;

public class UserManager {
	public void logIn(User user) {
		System.out.println(user.getFirstName() + " giriş yaptı!");
	}
	public void logOut(User user) {
		System.out.println(user.getFirstName() + " çıkış yaptı!");
	}
}
