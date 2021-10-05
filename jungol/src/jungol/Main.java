package jungol;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Double a = 0.0;
		
		a = sc.nextDouble();
		
		System.out.println("test");
		
		if(a<=50.80)
		{
			System.out.println("Flyweight");
		}
		else if(a<=61.23)
		{
			System.out.println("Lightweight");
		}
		else if(a<=72.57)
		{
			System.out.println("Middleweight");
		}
		else if(a<=88.45)
		{
			System.out.println("Cruiserweight");
		}
		else if(a>88.45)
		{
			System.out.println("Heavyweight");
		}
		
		sc.close();
	}

}
