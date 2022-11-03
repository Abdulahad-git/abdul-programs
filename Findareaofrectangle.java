package assingment;
import java.util.Scanner;

public class Findareaofrectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Length of the Rectangle:");
		double length=scan.nextInt();
		System.out.println("Enter the Width of the Rectangle:");
		double width=scan.nextInt();
		double area=length*width;
		System.out.println("Area of Rectangle is:"+area);

	}

}
