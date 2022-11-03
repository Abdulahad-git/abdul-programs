package assingment;
import java.util.Scanner;

public class reversinganumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int reversenum=0;
		System.out.println("Input your number and press Enter:");
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		while(num!=0)
		{
			reversenum=reversenum*10;
			reversenum=reversenum+num%10;
			num=num/10;
		}
		System.out.println("Reverse if Input number is:"+reversenum);
		

	}

}
