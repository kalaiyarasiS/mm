public class Palind {

	
	public static void main(String[] args) {
		StringBuffer s=new StringBuffer(args[0]);
StringBuffer mathi=s.reverse();
if(mathi.toString().equals(args[0]))
	System.out.println("THE GIVEN STRING IS PALINDROME");
else
	System.out.println("THE GIVEN STRING IS NOT A PALINDROME");
	}

}
Contact GitHub API Training Shop Blog About
© 2016 GitHub, Inc. Terms Privacy Security Status 
