import java.util.Scanner;

public class Restaurant {
	public static void Menu() {
		//3 menu 
		try(Scanner m4 = new Scanner(System.in)){
			System.out.println("A votr choix :");
			String m1 = m4.next();
		//String m1 = "pulet";
		String m2 = "viende";
		String m3 = "vegetarien";
		//int general = m1+m2+m3;
		System.out.println("menu 1 :"+m1+"\n menu 2 :"+m2+"\n menu 3 :"+m3);
		}
	}

}
