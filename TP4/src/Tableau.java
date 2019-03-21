
public class Tableau {


	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		   
		 // Def des Val mini et max
		  
		   int maxNote = 20;
	       int minNote = 0;
	       
	      // Tableau des notes
	       int array[] = {10,0, 8,14,17, 12,13,20};
	       int somme = 0;
	       
	      // Formule pour lire les notes dans le tableau note
	       for(int i = 0; i < array.length; i++){
	         if(array[i] < maxNote)
	           maxNote = array[i];
	         if(array[i] > minNote)
	           minNote = array[i];
	       }
	       // Definir la moyenne des notes
	       for(int i=0;i<array.length;i++) {
	    	    somme += array[i];
	    	} 
	      int moyenne = (somme )/ array.length ;
	       // Réponse des notes
	       System.out.print("\nNote la plus basse = "+maxNote);
	       System.out.print("\nMeilleur note = "+minNote);
	       System.out.println("\nLa moyenne des notes des élèves = "+moyenne);
	}

}
