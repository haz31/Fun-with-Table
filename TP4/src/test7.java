import java.util.Scanner;
public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String phrase = "il fait beau aujourdhui dimanche à toulouse";
		System.out.println("saisir le mot à rechercher dans la chaine ou la phrase:");
		String mot = scan.nextLine();
		
		if (phrase.contains(mot)){

				System.out.println("Mot trouvé"+" " + mot);
				System.out.println("Remplacer le mots par ? :");
				String remplace = scan.nextLine();
				phrase = phrase.replace(mot,remplace);
				
				

				}else{
						System.out.println("Mot pas trouvé");
		}
		System.out.println(phrase);
	}

}