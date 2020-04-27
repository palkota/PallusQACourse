package class_and_objects;

import java.util.Scanner;

public class AdditionOfTwoDecimalNumbers
{

public static void main(String[] args) {

		

		double fnum,snum,tnum;

		

		Scanner sn=new Scanner(System.in);

		System.out.print("Enter the fnum: ");

		fnum=sn.nextDouble();

		System.out.print("Enter the snum: ");

		snum=sn.nextDouble();

		tnum=fnum+snum;

		System.out.println(tnum);

	}


}
