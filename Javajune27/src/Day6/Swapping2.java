package Day6;
// swap 2 numbers with third variable
import java.util.Scanner;

public class Swapping2 {
	
	public void swap(int num1,int num2) {
		 num1= num1+ num2;
		 num2= num1- num2;
		 num1= num1-num2;
		
		System.out.println("Value of num1 after swapping: "+ num1);
		System.out.println("Value of num2 after swapping: "+ num2);
	}
	
	public static void main(String[] args) {
		Swapping2 s = new Swapping2();
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter two number for swapping");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		
		System.out.println("Value of num1 before swapping: "+ num1);
		System.out.println("Value of num2 before swapping: "+ num2 + "\n");
		
		s.swap(num1, num2);
	}

}
