import java.util.Scanner;
import java.util.Arrays;
import java.io.PrintStream;

public class Main1546{
	private static Scanner sc;
	private static PrintStream ps;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String... args){
		int n=sc.nextInt();
		while(n-- >0){
			int q=sc.nextInt();
			while(q-- >0){
				int v=sc.nextInt();
				ps.println(getResponsavel(v));
			}
		}	
	
	}
	public static String getResponsavel(int num){
		switch(num){
			case 1:
				return "Rolien";
			case 2:
				return "Naej";
			case 3:
				return "Elehcim";
			default :
				return "Odranoel";
		}
	}
	
	
}

