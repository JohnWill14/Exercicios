import java.util.Scanner;
import java.io.PrintStream;
public class Main2867{
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
			int valor=(int)(b*Math.log10(a))+1;
			ps.println(valor);
		}
	}
	
	
}

