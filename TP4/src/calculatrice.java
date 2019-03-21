import java.util.Scanner;
public class calculatrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	
		char operateur;
		double result = 0;
		System.out.print("Entrer la premiere valeur : ");
		int x = scan.nextInt();
		System.out.print("Entrer la seconde valeur : ");
		int y = scan.nextInt();
		scan.nextLine();
		System.out.print("De quelle opération s'agit il ? : (+, -, *, /,%) : ");
	    String op = scan.nextLine();
        operateur= op.charAt(0);
//	    char operateur = scan.nextLine.charAt();
		switch (operateur ) {
		case '+' : result = x + y;
			break;
		case '-' : result = x - y;
			break;
		case '/' : result = x / y;
			break;
		case '*' : result = x * y ;
			break;
		}
		System.out.print("Cette operation a pour resultat : ");
		System.out.println(x + " " + operateur + " "+ y + " = " + result);
		

	}

}
