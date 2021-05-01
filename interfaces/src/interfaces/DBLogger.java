package interfaces;

public class DBLogger implements Logger{

	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println(message + " db loglandı.");
	}

}
