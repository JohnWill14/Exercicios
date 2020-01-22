import java.util.Scanner;
import java.io.PrintStream;

public class Main1097{
	private static PrintStream  out;
	private static Scanner input;	
	public static void main(String[] args) {
		out=System.out;
		input=new Scanner(System.in);
		int aux=5;
		for (int i=1;i<10 ;i+=2 ) {
			for(int  j=aux+2;j>=aux;j--){
				out.println("I="+i+" J="+j);
			}
			aux+=2;
		}
	}
	
}
