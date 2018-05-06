package corejava;

import java.util.Scanner;

public class Euro_USdollar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("enter Euro amount");
int euro=input.nextInt();
double dollar=1.2;
double total=euro*dollar;
while(euro>0)
{
	System.out.println("the amount of dollaris" + total);
	System.out.println("enter euro amount" );
	dollar=input.nextInt();
	total=euro*dollar;
}
	}

}
