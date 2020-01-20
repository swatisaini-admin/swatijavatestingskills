package studyjava;
import java.util.Scanner;
public class MultiplyUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Enter first number");
int FN=input.nextInt();
System.out.println("Enter second number");
int SN=input.nextInt();
int output=FN*SN;
System.out.println("Multiplication of two numbers is " +output);

	}

}
