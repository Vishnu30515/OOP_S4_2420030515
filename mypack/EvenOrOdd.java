package mypack;
import java.util.Scanner;
public class EvenOrOdd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner op=new Scanner(System.in);
		int a=op.nextInt();
		if(a%2==0) {
			System.out.println(a+" is Even");
		}
		else {
			System.out.println(a+" is Odd");
		}

}
}