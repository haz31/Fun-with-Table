
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String teste = "akka";
    int left = 0 ;
    int right = teste.length()-1;
    boolean test = true ;
    
    while ((left < right )&& test){
    	if (teste.charAt(left)!=teste.charAt(right)) {
    test = false;
    }
    	left++;
    	right--;
    }
    if (test) {
    	System.out.println(" ceci est un palindrome");
    }
    else {
    	System.out.println("ceci n'est pas un palindrome");
    }
	}
}



	

