import java.util.Scanner;
public class Program02{
	static int  numSearch(int a[],int key) {
		for(int i=0;i<a.length;i++)
		{
			if(key==a[i])
			{
				return i;
			}
		}
			return 0;
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
		
		int res= numSearch(arr,key);
		if(res<0)
		   {
			System.out.println("number not found");
		    }
		else
		  {
			System.out.println(key+"is found in the position:"+(res));
		}
	}
}
