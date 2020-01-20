package studyjava;
import java.util.Scanner;
public class Addingnumbersuserinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Enter first number");
int FN= input.nextInt();
System.out.println("Enter Second number");
int SN= input.nextInt();
int Output=FN+SN;
System.out.println("addition of two numbers is "+Output);
	}

}
