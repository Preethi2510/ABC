import java.util.Scanner;
public class Sum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int sum=0;
		int arr[]=new int [n];
		for(int i=0;i<n;i++) 
		{
			System.out.println("Enter the number");
			arr[i]=sc.nextInt();
					
		}
		for(int i=0;i<n;i++) 
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}
}
