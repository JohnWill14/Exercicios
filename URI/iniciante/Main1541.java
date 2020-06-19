import java.util.Scanner;
import java.io.PrintStream;
public class Main1541{
	private static Scanner sc;
	private static PrintStream ps;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String... args){
		while(true){
			int a=sc.nextInt();
			if(a==0)break;
			int b=sc.nextInt();
			int c=sc.nextInt();

			int valor=(int)Math.sqrt((a*b*100)/(c*1.0));
			ps.println(valor);
		}
	}
	
	
}

