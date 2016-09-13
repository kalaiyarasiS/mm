import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DAG123 {
public static void main(String[] args) {
	Scanner scr=new Scanner(System.in); 
	String s=scr.nextLine();//    3/\94/\/\182/\/\/\4582
	ArrayList<Integer> al=new ArrayList<>();
	ArrayList<Integer> al2=new ArrayList<>();
	for(int i=0;i<s.length();i++)
	{  if(Character.isDigit(s.charAt(i)))
		{   
			al.add(Integer.parseInt(s.charAt(i)+""));
			
		}
		else
		{
		if(al.size()>1){
		al2.add(check(al));
		al=null;
		al=new ArrayList<>();
		}
		else if(al.size()==1){
			System.out.println("else");
			al2.add(al.get(0));
			al=null;
			al=new ArrayList<>();
			
		}		
			}
		}
	if(al.size()>1){
		al2.add(check(al));
		al=null;
		al=new ArrayList<>();
		}
		else if(al.size()==1){
			al2.add(al.get(0));
			al=null;
			al=new ArrayList<>();
			
		}
	System.out.println(al2);
	int sum=0;
	for(int i:al2)
	   sum+=i;
	System.out.println("answer"+sum);
	scr.close();
	}
	
public static int check(ArrayList<Integer> al3)
{  	int[] temp=new int[al3.size()];
   int k=0;
	for(int i:al3)
		temp[k++]=i;
	Arrays.sort(temp);
		return temp[temp.length-1];
		
}
}
