public class Tableaux{
	public static void exo1() {
		int[] t = new int[10];
		t[0] = 1;
		System.out.println(t[0]);
	}
	
	public static String  exo2() 
	{
		//vous initialiserez le tableau avec une boucle
		int[] t = new int[10];
		String message = "";
		
		for(int n = 0; n < 10 ; n++)
		{
			t[n] = n+1;
			message +=" valeur : " +t[n]+"\n";
		}
			return message;
	}
		//afficher la somme des n éléments du tableau 
		/*int somme ;
		somme = */
	}
	
