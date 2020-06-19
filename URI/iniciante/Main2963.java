import java.util.Scanner;
import java.io.PrintStream;

public class Main2963{
	private static Scanner sc;
	private static PrintStream ps;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String[] args) {
		int n=sc.nextInt();
		n--;
		int carlos=sc.nextInt();
		boolean ganhou=true;
		for(int i=0;i<n;i++){
			if(sc.nextInt()>carlos)ganhou=false;
		}
		if(ganhou)ps.println("S");
		else ps.println("N");
		
	}
}
