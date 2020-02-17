package cn.hyperchain.buildplan;
import java.util.*;

public class cost {

	public static void main(String[] args) {
		System.out.printf("Enter your choice:\n 1:Standard materials \n 2:Above standard\n 3:High Standard\n 4:Automated with High standard");
		int ch;
		double no_of_sqft,cost;
		Scanner sc=new Scanner (System. in);
		ch=sc.nextInt();
		System.out.printf("Enter number of square feet:\n");
		no_of_sqft=sc.nextDouble();
		switch(ch) {
		case 1:
			cost=no_of_sqft*1200;
			System.out.println("The total cost is"+cost+"INR");
			break;
		case 2:
			cost=no_of_sqft*1500;
			System.out.println("The total cost is"+cost+"INR");
			break;
		case 3:
			cost=no_of_sqft*1800;
			System.out.println("The total cost is"+cost+"INR");
			break;
		case 4:
			cost=no_of_sqft*2500;
			System.out.println("The total cost is"+cost+"INR");
			break;
		
		}

	}

}
