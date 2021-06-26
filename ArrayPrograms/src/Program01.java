import java.util.Scanner;
public class Program01 {
	static boolean numSearch(int a[],int key) {
		for(int i=0;i<a.length;i++)
		{
			if(key==a[i])
			{
				return true;
			}
		}
			return false;
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++) 
		{
			System.out.println("Enter the number");
			arr[i]=sc.nextInt();
				
		}
		System.out.println("Enter the number to be searched");
		int key=sc.nextInt();
		boolean res= numSearch(arr,key);
		if(res==true)
		   {
			System.out.println("number found");
		    }
		else
		  {
			System.out.println("number not found");
		}
	}
}
