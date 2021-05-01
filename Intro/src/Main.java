import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		String internetSubeButonu = "HAlkbank";
		double dolarDun = 123.1;
		double dolarDun2 = 122.1;
		if (dolarDun < dolarDun2) {
			System.out.println("asd");
		}else {
			System.out.println("asdasdasdasd");			
		}
		String[] krediler = {"kredi1","kredi2"};
		ArrayList<String> kredit = new ArrayList<String>();
		kredit.add("kredi1");
		kredit.add("kredi2");
		for (String string : kredit) {
			System.out.println(string);
		}

		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(1);
		for (int i=2;i<5; i++) {
			  test.add(i);
			}
		for (Integer inta : test) {
			System.out.println(inta);
		}

	}

}
