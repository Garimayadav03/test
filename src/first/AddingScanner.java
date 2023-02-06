package first;

import java.util.Scanner;

public class AddingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Firstnumber, SecondNumber, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        Firstnumber = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        SecondNumber = sc.nextInt();
        
       
        sum = Firstnumber + SecondNumber;
        System.out.println("Sum of these numbers: "+sum);
	}

}
