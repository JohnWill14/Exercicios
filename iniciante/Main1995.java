import java.util.Scanner;
import java.io.PrintStream;

public class Main1995{
	private static PrintStream  out;
	private static Scanner input;	
	public static void main(String[] args) {
		out=System.out;
		input=new Scanner(System.in);
		for(int i=1,j=60;j>=0;i+=3,j-=5){
			out.println("I="+i+" J="+j);
		}
	}
	
}
