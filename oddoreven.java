package assingment;
import java.util.Scanner;

public class oddoreven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("Enter an integer:");
		num=scan.nextInt();
		
		if (num%2==0)
			System.out.println("ENTERED NUMBER IS EVEN..");
		else
			System.out.println("ENTERED NUMBER IS ODD..");

	}

}
