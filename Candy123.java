import java.util.Scanner;


public class Candy123 {

	
	public static void main(String[] args) {
		 Scanner ob=new Scanner(System.in);
	     System.out.println("Please enter the value:");
	     int N=ob.nextInt();
	     int a=0;
	     int b=1;
	     while(N!=0)
	     {
	    	 a=a+b;
	    	 b=b+1;
	    	 N=N-1;
	     }
	     System.out.println(a);
	}

}
