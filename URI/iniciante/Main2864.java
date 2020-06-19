import java.util.Scanner;
import java.io.PrintStream;
public class Main2864{
	private static Scanner sc;
	private static PrintStream ps;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String... args){
		int cont=sc.nextInt();
		while(cont-- >0){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();

			int delta=b*b-4*a*c;

			double valor=delta/(-4d*a);
			ps.println(String.format("%.2f",valor));
		}
	}
	
	
}

