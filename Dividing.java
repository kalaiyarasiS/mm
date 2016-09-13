import java.util.Scanner;
public class Dividing{

	public static void main(String[] args) {
		System.out.println("Enter the Size of an Array:");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		System.out.println("Enter the Elements of an Array:");
		int sum1=0;
		int avg1=0;
		int sum2=0;
		int avg2=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		 System.out.println("The Entered Array is:");
		for(int j=0;j<arr.length;j++){
			System.out.print(arr[j]+" ");
			
		}
		System.out.println(" ");
		if(arr.length%2==0){
			int div1[]=new int[arr.length/2];
			int div2[]=new int[arr.length/2];
			for(int c1=0;c1<div1.length;c1++){
				div1[c1]=arr[c1];
				//System.out.println(div1[c1]);
			}
			for(int c2=div1.length;c2<arr.length;c2++){
				for(int c3=0;c3<div2.length-1;c3++){
					div2[c3]=arr[c2];
					//System.out.println(div2[c3]);
					break;
					
				}
				
				}
			for(int i=0;i<div1.length;i++){
				sum1+=div1[i];
				
			}
			avg1=sum1/div1.length;
			for(int j=0;j<div2.length;j++){
				sum2+=div2[j];
				
			}
			avg2=sum1/div1.length;
			if(avg1==avg2){
				System.out.println("The averages of Splitted arrays are matching");
				System.out.println("The Splitted Arrays are:");
				for(int i=0;i<div1.length;i++){
					System.out.print(div1[i]+" ");
				}
				for(int i=0;i<div2.length;i++){
					System.out.print(div2[i]+" ");
				}
			}
			else{
				System.out.println("Not Possible");
			}
			
			}
		else{
			int div1[]=new int[(arr.length/2)+1];
			int div2[]=new int[arr.length/2];
			for(int i=0;i<div1.length;i++){
				div1[i]=arr[i];
			}
			for(int c2=div1.length;c2<arr.length;c2++){
				for(int c3=0;c3<div2.length-1;c3++){
					div2[c3]=arr[c2];
					//System.out.println(div2[c3]);
					break;
					
			
				}
		}
			for(int i=0;i<div1.length;i++){
				sum1+=div1[i];
				
			}
			avg1=sum1/div1.length;
			for(int j=0;j<div2.length;j++){
				sum2+=div2[j];
				
			}
			avg2=sum1/div1.length;
			if(avg1==avg2){
				System.out.println("The averages of Splitted arrays are matching");
				System.out.println("The Splitted Arrays are:");
				for(int i=0;i<div1.length;i++){
					System.out.print(div1[i]+" ");
				}
				for(int i=0;i<div2.length;i++){
					System.out.print(div2[i]+" ");
				}
			}
			else{
				System.out.println("Not Possible");
			}
		
			}
		
	}

}		
