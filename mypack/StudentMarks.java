package mypack;
import java.util.Scanner;
public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner op=new Scanner(System.in);
		int a=op.nextInt();
		if(a>=80) {
			System.out.println("A Grade");
		}
		else if(a>69 && a<=79) {
			System.out.println("B Grade");
		}
		else if(a>59 && a<=69) {
			System.out.println("C Grade");
		}
		else if(a<=59) {
			System.out.println("F Grade");
		}
	}

}
