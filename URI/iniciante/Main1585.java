import java.util.Scanner;
import java.util.Arrays;
import java.io.PrintStream;

public class Main1585{
	private static Scanner sc;
	private static PrintStream ps;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String... args){
		int n=sc.nextInt();
		while(n-- >0){
			int a=sc.nextInt();
			int b=sc.nextInt();
			double val=((a*b/2d));
			ps.println(String.format("%.0f",Math.floor(val))+" cm2");
		}	
	
	}
	
	
}

