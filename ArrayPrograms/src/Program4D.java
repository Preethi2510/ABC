//Ranjith
import java.util.Scanner;
public class Program4D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of universities:");
		int m = sc.nextInt();
		System.out.println("Enter the number of colleges in each university:");
		int n = sc.nextInt();
		System.out.println("Enter the number of classes in each college:");
		int o = sc.nextInt();
		System.out.println("Enter the number of students in each class:");
		int p = sc.nextInt();
		String a[][][][] = new String[m][n][o][p];
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
					for(int l=0;l<a[i][j][k].length; l++) {
				         System.out.println("Enter the name of the student-"+(l+1)+" in class-"+(k+1)+" from college-"+(j+1)+" of university-"+(i+1)+":");
				         a[i][j][k][l]=sc.next();
					}
				}
			}
		}
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
					for(int l=0;l<a[i][j][k].length; l++) {
				         System.out.println("The name of the student-"+(l+1)+" in class-"+(k+1)+" from college-"+(j+1)+" of university-"+(i+1)+":"+a[i][j][k][l]);
					}
				}
			}
		}
		
		
	}

}
