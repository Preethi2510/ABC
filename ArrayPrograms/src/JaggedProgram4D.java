//Ranjith
import java.util.Scanner;
public class JaggedProgram4D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of universities:");
		int m=sc.nextInt();
		int n,o,p;
		String a[][][][]=new String[m][][][];
		for(int i=0;i<m;i++) {
			System.out.println("Enter the number of colleges in university-"+(i+1)+":");
			n=sc.nextInt();
			a[i]=new String[n][][];
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<a[i].length;j++) {
			   System.out.println("Enter the number of classes in college-"+(j+1)+" of university-"+(i+1)+":");
			   o=sc.nextInt();
			   a[i][j]=new String[o][];
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
			        System.out.println("Enter the number of students in class-"+(k+1)+" from college-"+(j+1)+" of university-"+(i+1)+":");
			        p=sc.nextInt();
			        a[i][j][k]=new String[p];
				}
			}
		}
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
					for(int l=0;l<a[i][j][k].length;l++)
					{
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
					for(int l=0;l<a[i][j][k].length;l++)
					{
				        System.out.println("the name of the student-"+(l+1)+" in class-"+(k+1)+" from college-"+(j+1)+" of university-"+(i+1)+":"+a[i][j][k][l]);
		
					}
				}
			}
		}
	}

}
