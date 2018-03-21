package Ex3;
import java.util.Scanner;
public class Ex3 {

		// Using scanner to print out numbers saved into an array.

	public static void main(String[]args){

		Scanner scanner=new Scanner(System.in);

		//This is how you implement scanner in an array.

		System.out.println("Enter a number");
		int a=scanner.nextInt();
		System.out.println("Enter a number");
		int b=scanner.nextInt();
		System.out.println("Enter a number");
		int c=scanner.nextInt();

		int[] numlist=new int[3];

		numlist[0]=a;
		numlist[1]=b;
		numlist[2]=c;

		for(int i=0; i<3; i++)
		{
			System.out.println(numlist[i]);
		}

		//Easier way to implement scanner in an array.

		System.out.println("Enter 3 more numbers");

		int[] numlist2=new int[3];

		numlist2[0]=scanner.nextInt();
		numlist2[1]=scanner.nextInt();
		numlist2[2]=scanner.nextInt();

		for(int i=0; i<3; i++)
		{
			System.out.println(numlist2[i]);
		}

		//Easiest way to implement scanner in an array.

		int[] numlist3=new int[2];

		for(int i=0; i<numlist3.length;i++){

			System.out.println("Enter a number");
			numlist3[i]=scanner.nextInt();
		}

		for(int i=0; i<2; i++)
		{
			System.out.println(numlist3[i]);
		}
	}
}
