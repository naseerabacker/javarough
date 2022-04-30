/* Write a menu driven program that would choose either in-built
method or call a user defined method to sort an array of strings*/
import java.util.*;
public class Sort
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		int i;
		System.out.println("enter no.of elements:");
		int n=s.nextInt();
		int array[]=new int[n];
		System.out.println("Enter elements:");
			for(i=0;i<n;i++)
			{
			 array[i]=s.nextInt();
			}
			sortarray(array,array.length);
			System.out.println("array after sort:");
			{
			  
			System.out.length(array[i]);
		         }
public static void sortarray(int array[],int n)
{

for(int i=1;i<n;i++)
{
  for(int j=i+1;j<n;j++)
  {
   int tmp=0;
   if(array[i]>array[j])
   {

	tmp=array[i];
	array[i]=array[j];
	array[j]=tmp;
	}
	}
	System.out.println(array[i]);
}
}
}
