import java.util.Scanner;
import java.io.PrintStream;

public class Main1096{
	private static PrintStream  out;
	private static Scanner input;	
	public static void main(String[] args) {
		out=System.out;
		input=new Scanner(System.in);
		for (int i=1;i<10 ;i+=2 ) {
			for(int j=7;j>4;j--){
				out.println("I="+i+" J="+j);
			}
		}
	}
	
}
