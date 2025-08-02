package mypack;
import java.util.Scanner;
public class Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner op=new Scanner(System.in);
		int a;
		do {
			a=op.nextInt();
			if(a!=0) {
				System.out.println(a);
			}
		}
		while(a!=0); {
			System.out.println("End");
		}

	}

}

