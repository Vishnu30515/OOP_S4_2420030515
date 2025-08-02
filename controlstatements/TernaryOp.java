package controlstatements;
import java.util.Scanner;

public class TernaryOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner op= new Scanner(System.in);
		int b=op.nextInt();
		int a=op.nextInt();
		int max;
		max = (a > b) ? a : b;
		System.out.println(max);
		

	}

}