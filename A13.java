 import java.io.*;
import java.util.*;
public class A13 {




        public static void main(String args[])throws IOException
        {
                 Scanner br = new Scanner (System.in);
                 System.out.println("Enter the no. of elements");

                 int n = br.nextInt();
                 int arr[]=new int[n];
                System.out.println("Enter the elements");
                for(int i=0;i<n;i++)
                arr[i] = br.nextInt();

                for(int i=0;i<n;i++)
                {
                        for(int j=0;j<n-1;j++)
                        {
                                if(arr[j]>arr[j+1]){
                                                     int temp=arr[j];
                                                     arr[j]=arr[j+1];
                                                     arr[j+1]=temp;
                                         }
                        }
                 }System.out.println("\nsorted array");
                 System.out.println("\n");
                for(int i=0;i<n;i++)

                System.out.println(arr[i]);
        }
}
