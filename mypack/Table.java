package mypack;
import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner op=new Scanner(System.in);
		int p=op.nextInt();
		for(int i=1;i<=10;i++) {
			int o=p*i;
			System.out.println(p+" X " + i + " = "+ o);
		}
	}

}