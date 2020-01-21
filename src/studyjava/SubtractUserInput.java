package studyjava;
import java.util.Scanner;
public class SubtractUserInput {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
System.out.println("Enter First number");
int fn=input.nextInt();
System.out.println("Enter Second number");
int sn=input.nextInt();
int output=fn-sn;
System.out.println("Subtraction of two numbers is " +output);
	}

}
