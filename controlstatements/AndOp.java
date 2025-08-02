package controlstatements;

import java.util.Scanner;

public class AndOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner op= new Scanner(System.in);
			int x=op.nextInt();
			int y=op.nextInt();
			if(x>=35 && y>=35) {
				System.out.println("Pass");
			}
			else {
					System.out.println("Fail");
				}
			}
	}

