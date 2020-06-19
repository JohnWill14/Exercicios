import java.util.Scanner;
import java.io.PrintStream;

public class Main2879{
	private static Scanner sc;
	private static PrintStream ps;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String[] args) {
		int n=sc.nextInt();
		int cont=0;
		for(int i=0;i<n;i++)if(sc.nextInt()==1)cont++;
		ps.println(n-cont);
	}
}
