
import java.util.Scanner;

public class firststep {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
		// debut "bonjour"+variable name
		System.out.println("Hello Teacher, press enter ");
		Scanner sc = new Scanner(System.in);
	    String name = sc.nextLine();
	    char reponse;
	    char[] oui = {'o'};
	    char[] non = {'n'};
	    boolean question = false;
	    
		//Tableau vide
		int tableau[] = new int[5];
		int moyenne = 0;
		//Boucle tableau ??   
		do {	
			for(int i = 0; i < tableau.length; i++)
			{
				
				System.out.println("Veuillez saisir le nom de l'élève:");
				name = sc.nextLine();
				System.out.println("Veuillez saisir les notes de l'élève:");
				int noteEleve = sc.nextInt();
				tableau[i] = noteEleve;	
				//retour de la moyenne ?
			   //   System.out.println(tableau[i]);
				moyenne += tableau[i]; // moyenne = moyenne + tableau[i]
			}
			System.out.println("moyenne de l'élève "+ name + " "+":" + moyenne/tableau.length);
		    System.out.println("Continuer ?");
		    String temp = sc.next();
		        
		    reponse = temp.charAt(0);
		    
		    if (reponse == 'o') { question = true; };
		    
		} while (false);
				
	}
}
